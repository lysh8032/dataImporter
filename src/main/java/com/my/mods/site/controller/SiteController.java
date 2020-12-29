package com.my.mods.site.controller;

import com.my.base.controller.BaseController;
import com.my.common.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/site")
public class SiteController extends BaseController {

    @RequestMapping(value = {"/", "/list"})
    //@RequiresPermissions("site:list")
    public R list() {
        return R.ok();
    }

}
