package com.my.mods.rights.vo;

import com.my.common.DataTransfer;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MenuParam extends DataTransfer {

    private static final long serialVersionUID = 1L;

    private String menuId;

    private String menuCode;

    private String menuName;

    private String parentId;

    private String link;

    private Integer level;

    private String target;

    private String hasChild;

    private Integer sort;

    private String icon;

    private String isShow;

    private String status;

    private String userId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
