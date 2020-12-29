package com.my.mods.login.controller;

import com.my.base.controller.BaseController;
import com.my.common.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class LoginContorller extends BaseController {

    @RequestMapping(value = "/check")
    //@RequiresPermissions("site:list")
    @ResponseBody
    public R list() {
        HttpSession session = getRequest().getSession();
        Map<String, String> ret = new HashMap<String, String>();
        ret.put("token", session.getId());
        return R.ok(ret);
    }

}
