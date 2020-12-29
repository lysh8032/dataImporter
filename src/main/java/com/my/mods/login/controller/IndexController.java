package com.my.mods.login.controller;

import com.my.base.controller.BaseController;
import com.my.common.R;
import com.my.mods.login.vo.IndexVo;
import com.my.mods.rights.service.IMenuService;
import com.my.mods.rights.vo.TreeMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class IndexController extends BaseController {

    private IMenuService menuService;

    @RequestMapping("/index")
    @ResponseBody
    public R index() {
        IndexVo vo = new IndexVo();
        try {
            // 查询树目录
            List<TreeMenu> treeList = menuService.getMenuTree();
            vo.setMenuList(treeList);
            vo.setSkin("pcoded-navbar navbar-image-3,navbar pcoded-header navbar-expand-lg navbar-light header-dark,");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(e.getMessage());
        }
        return R.ok(vo);
    }

    @Autowired
    public void setMenuService(IMenuService menuService) {
        this.menuService = menuService;
    }
}
