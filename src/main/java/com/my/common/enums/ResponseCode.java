package com.my.common.enums;

public enum ResponseCode {

    SUCCESS(0, "SUCCESS"),
    FAIL(-1, "FAIL"),
    ERROR(99, "网络异常"),
    ERROR_TOKEN(10000, "您已经登录超时或者您的账号已经在别的设备上登录");

    private Integer code;

    private String value;

    ResponseCode(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
