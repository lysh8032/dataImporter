package com.my.common;

import com.my.enums.ResponseCode;

import java.io.Serializable;

public class R<E> implements Serializable {

    private static final long serialVersionUID = -187570094792271948L;

    /**
     * 操作结果的状态码，具体定义参见ResponseCode类的定义
     */
    protected int code;

    /**
     * 操作结果的描述信息，可作为页面提示信息使用
     */
    protected String msg;

    /**
     * 返回的业务数据
     */
    protected E data;

    protected Page page;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
        if (code == ResponseCode.SUCCESS.getCode()) {
            this.msg = "SUCCESS";
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public R() {

    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R(int code, String msg, E data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static R fail() {
        return new R(ResponseCode.FAIL.getCode(), ResponseCode.FAIL.getValue());
    }

    public static R fail(String desc) {
        return new R(ResponseCode.FAIL.getCode(), desc);
    }

    public static R error(String desc) {
        return new R(ResponseCode.ERROR.getCode(), desc);
    }

    public static R error() {
        return new R(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getValue());
    }

    public static R ok() {
        return new R(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getValue());
    }

    public static R ok(String msg) {
        return new R(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static R ok(Object e) {
        R r = new R();
        r.setCode(ResponseCode.SUCCESS.getCode());
        r.setMsg(ResponseCode.SUCCESS.getValue());
        r.setData(e);
        return r;
    }

    public static R ok(String msg, Object e) {
        R r = new R();
        r.setCode(ResponseCode.SUCCESS.getCode());
        r.setMsg(msg);
        r.setData(e);
        return r;
    }

    public static R ok(Object e, Page page) {
        R r = new R();
        r.setCode(ResponseCode.SUCCESS.getCode());
        r.setMsg(ResponseCode.SUCCESS.getValue());
        r.setData(e);
        r.setPage(page);
        return r;
    }

    public static R ok(String msg, Object e, Page page) {
        R r = new R();
        r.setCode(ResponseCode.SUCCESS.getCode());
        r.setMsg(msg);
        r.setData(e);
        r.setPage(page);
        return r;
    }

    public static R errorToken() {
        R r = new R();
        r.setCode(ResponseCode.ERROR_TOKEN.getCode());
        r.setMsg(ResponseCode.ERROR_TOKEN.getValue());
        return r;
    }
}
