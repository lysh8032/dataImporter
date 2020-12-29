package com.my.mods.rights.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author Ashin
 * @since 2020-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("pd_ad_menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单ID
     */
    @TableId(value = "menu_id", type = IdType.INPUT)
    private String menuId;

    /**
     * 菜单代码
     */
    @TableField(value = "menu_code")
    private String menuCode;

    /**
     * 菜单名称
     */
    @TableField(value = "menu_name")
    private String menuName;

    /**
     * 父ID
     */
    @TableField(value = "parent_id")
    private String parentId;

    /**
     * 链接地址
     */
    @TableField(value = "link")
    private String link;

    /**
     * 级别
     */
    @TableField(value = "level")
    private Integer level;

    /**
     * 目标页
     */
    @TableField(value = "target")
    private String target;

    /**
     * 是否包含下级菜单：0否，1是。
     */
    @TableField(value = "has_child")
    private String hasChild;

    /**
     * 菜单排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 图标元素
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 是否显示标志：1是0否
     */
    @TableField(value = "is_show")
    private String isShow;

    /**
     * 菜单状态 0停用 1在用
     */
    @TableField(value = "status")
    private String status;

    @TableField(value = "user_id")
    private String userId;

    @TableField(value = "created_at")
    private LocalDateTime createdAt;

    @TableField(value = "updated_at")
    private LocalDateTime updatedAt;

}
