package com.my.mods.identityCard.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("info_identity_card")
public class IdentityCard implements Serializable {

    @TableId(value = "identityCard_id", type = IdType.INPUT)
    private String identityCardId;

    @TableField("card_number")
    private String cardNumber;

    @TableField("name")
    private String name;

    @TableField("born_year")
    private String bornYear;

    @TableField("born_month")
    private String bornMonth;

    @TableField("born_day")
    private String bornDay;

    @TableField("gender")
    private String gender;

    @TableField("administrative_division_code")
    private String administrativeDivisionCode;

    @TableField("insert_time")
    private Date insertTime;

    @TableField("modify_time")
    private Date modifyTime;

    @TableField("user_id")
    private String userId;

    @TableField("modify_user_id")
    private String modifyUserId;

}
