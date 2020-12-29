package com.my.mods.rights.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.my.common.R;
import com.my.mods.rights.entity.Menu;
import com.my.mods.rights.mapper.MenuMapper;
import com.my.mods.rights.service.IMenuService;
import com.my.mods.rights.vo.MenuParam;
import com.my.mods.rights.vo.TreeMenu;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ashin
 * @since 2020-11-09
 */
@Service
public class MenuServiceImpl implements IMenuService {

    private MenuMapper menuMapper;

    /**
     * 分页显示列表
     * @param param
     * @return
     * @throws Exception
     */
    @Override
    public List<R<Menu>> listByPage(MenuParam param) throws Exception {
        QueryWrapper<Menu> wrapper = buildWrapper(param);

        return null;
    }

    protected QueryWrapper<Menu> buildWrapper(MenuParam param) {
        QueryWrapper<Menu> wrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(param.getKEYWORDS())) {
            Consumer<QueryWrapper<Menu>> consumer = new Consumer<QueryWrapper<Menu>>() {
                @Override
                public void accept(QueryWrapper<Menu> keyWrapper) {
                    keyWrapper.like("menu_id", param.getKEYWORDS()).or().like("menuName", param.getKEYWORDS());
                }
            };
            wrapper.and(consumer);
        }

        if(StringUtils.isNotBlank(param.getMenuCode())){
            wrapper.like("menu_code",param.getMenuCode());
        }
        if(StringUtils.isNotBlank(param.getMenuName())){
            wrapper.like("menu_name",param.getMenuName());
        }
        if(StringUtils.isNotBlank(param.getParentId())){
            wrapper.eq("menu_name",param.getParentId());
        }


        return wrapper;
    }

    /**
     * 生成菜单树目录
     * @return
     * @throws Exception
     */
    public List<TreeMenu> getMenuTree() throws Exception {
        QueryWrapper<Menu> wrapper = new QueryWrapper<>();
        wrapper.eq("is_show", "1"); // 是否显示标志
        wrapper.eq("status", "1"); // 状态标志 1 为正常
        wrapper.orderByAsc("level").orderByAsc("sort"); // 排序方式
        List<Menu> menuList = menuMapper.selectList(wrapper); // 查询
        if(menuList == null || menuList.size() < 1) {
            return null;
        }
        // 生成树状菜单
        return buildTree(menuList);
    }

    /**
     * 遍历所有菜单
     * 把菜单对像转换为TreeMenu对象
     * 一级菜单保存到treeList，其他下级菜单保存到上级菜单的subMenu中。
     * treeMap临时保存所有的菜单对象，用来查找上级菜单的引用。
     * @param menuList Menu list
     * @return
     */
    private List<TreeMenu> buildTree(List<Menu> menuList) {
        List<TreeMenu> treeList = new ArrayList<TreeMenu>();
        Map<String, TreeMenu> treeMap = new HashMap<String, TreeMenu>();
        for(Menu menu : menuList) {
            TreeMenu node = new TreeMenu();

            node.setMenuId(menu.getMenuId());
            node.setMenuName(menu.getMenuName());
            node.setParentId(menu.getParentId());
            node.setTarget(menu.getTarget());
            node.setUrl(menu.getLink());
            node.setHasMenu(menu.getHasChild().equals("1"));
            node.setMenuState(menu.getStatus());
            node.setOrder(String.valueOf(menu.getSort()));
            node.setSubMenu(new ArrayList<TreeMenu>()); // 生成一个空的list
            node.setIcon(menu.getIcon() == null ? "" : menu.getIcon());
            // 一级menu加到list，其他的加到submenu
            if(menu.getLevel() == 1) {
                treeList.add(node);
            } else {
                // 从map中得到上级node，加入到subMenu
                TreeMenu parent = treeMap.get(node.getParentId());
                /*if(parent.getSubMenu() == null) {
                    parent.setSubMenu(new ArrayList<TreeMenu>());
                }*/
                parent.getSubMenu().add(node);
            }
            treeMap.put(node.getMenuId(), node);

        }
        return treeList;
    }

    @Autowired
    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }
}
