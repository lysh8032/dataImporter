package com.my.mods.user.vo;

import com.my.common.DataTransfer;
import lombok.Data;

import java.util.Date;

@Data
public class UserParam extends DataTransfer {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String loginId;

    private String loginPwd;

    private String nickName;

    private String gender;

    private String birthday;

    private String email;

    private String status;

    private Date lastLoginTime;

    private String isOnline;

    private Date createdAt;

    private Date updatedAt;

}
