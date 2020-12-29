package com.my.mods.rights.service;

import com.my.common.R;
import com.my.mods.rights.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.my.mods.rights.vo.MenuParam;
import com.my.mods.rights.vo.TreeMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Ashin
 * @since 2020-11-09
 */
public interface IMenuService {

    List<R<Menu>> listByPage(MenuParam param) throws Exception;

    List<TreeMenu> getMenuTree() throws Exception;

}
