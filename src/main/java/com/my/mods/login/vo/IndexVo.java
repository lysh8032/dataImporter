package com.my.mods.login.vo;

import com.my.mods.rights.vo.TreeMenu;
import lombok.Data;

import java.util.List;

@Data
public class IndexVo {

    private List<TreeMenu> menuList;
    private String skin;
    private List<String> permission;

}
