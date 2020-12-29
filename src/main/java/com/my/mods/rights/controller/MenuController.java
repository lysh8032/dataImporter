package com.my.mods.rights.controller;


import com.my.base.controller.BaseController;
import com.my.common.R;
import com.my.mods.rights.service.IMenuService;
import com.my.mods.rights.vo.MenuParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Ashin
 * @since 2020-11-09
 */
@RestController
@RequestMapping("/admin/rights")
public class MenuController extends BaseController {

    private IMenuService menuService;

    @PostMapping(value = "/list")
    @RequiresPermissions("otherInBill:list")
    public R list(MenuParam param) throws Exception {

        return null;
    }

    @Autowired
    public void setMenuService(IMenuService menuService) {
        this.menuService = menuService;
    }
}
