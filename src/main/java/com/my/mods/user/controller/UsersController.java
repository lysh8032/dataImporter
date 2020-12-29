package com.my.mods.user.controller;


import com.my.base.controller.BaseController;
import com.my.common.R;
import com.my.mods.user.service.IUsersService;
import com.my.mods.user.vo.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Ashin
 * @since 2020-11-09
 */
@RestController
@RequestMapping("/admin/user")
public class UsersController extends BaseController {

    private IUsersService userService;

    @RequestMapping(value = {"/", "/list"})
    @ResponseBody
    public R list(UserParam param) {
        try {
            return userService.list(param);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(e.getMessage());
        }
    }

    @RequestMapping("/getInfo")
    @ResponseBody
    public R getInfo(UserParam param) {
        return R.ok();
    }

    @Autowired
    public void setUserService(IUsersService userService) {
        this.userService = userService;
    }

}

