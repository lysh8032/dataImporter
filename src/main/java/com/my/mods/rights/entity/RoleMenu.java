package com.my.mods.rights.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("pd_ad_role_menu")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色权限对应表ID
     */
    @TableId(value = "rm_id", type = IdType.INPUT)
    private String rmId;

    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 权限ID
     */
    private String menuId;

    private String createdBy;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


}
