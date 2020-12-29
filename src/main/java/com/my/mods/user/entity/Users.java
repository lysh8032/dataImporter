package com.my.mods.user.entity;

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
@TableName("pd_users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户系统ID，唯一标识
     */
    @TableId(value = "user_id", type = IdType.INPUT)
    private String userId;

    /**
     * 用户登陆ID，英数_-
     */
    private String loginId;

    /**
     * 用户登陆密码
     */
    private String loginPwd;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别 m男f女
     */
    private String gender;

    /**
     * 出生日期：yyyymmdd
     */
    private String birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户状态 1正常
     */
    private String status;

    /**
     * 登陆时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 当前是否在线 0否1是
     */
    private String isOnline;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
