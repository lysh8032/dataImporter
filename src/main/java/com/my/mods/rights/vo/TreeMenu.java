package com.my.mods.rights.vo;

import lombok.Data;

import java.util.List;

@Data
public class TreeMenu {

    private String target;
    private String parentMenu;

    private boolean hasMenu;
    private String parentId;
    private String menuState;
    private String menuId;
    private String shiroKey;
    private String order;
    private String menuName;
    private String url;
    private String icon;
    private String type;

    private List<TreeMenu> subMenu;

}
