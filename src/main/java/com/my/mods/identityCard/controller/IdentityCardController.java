package com.my.mods.identityCard.controller;

import com.my.base.controller.BaseController;
import com.my.common.R;
import com.my.mods.identityCard.service.IIdentityCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/idCard")
public class IdentityCardController extends BaseController {

    private IIdentityCardService identityCardService;

    @RequestMapping(value = {"/", "/list"})
    //@RequiresPermissions("site:list")
    @ResponseBody
    public R list() {
        identityCardService.list();
        return R.ok();
    }

    @Autowired
    public void setIdentityCardService(IIdentityCardService identityCardService) {
        this.identityCardService = identityCardService;
    }
}
