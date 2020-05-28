package com.sulbert.common.entity;

/**
 * Author: Sulbert
 * Date: 2020/5/18
 * Description: 公共返回码
 */
public enum ResultCode {

    SUCCESS(true,200,"操作成功"),
    FAIL(false,501,"操作失败"),
    UNAUTHENTICATED(false,401,"尚未登录"),
    UNAUTHORISED(false,402,"权限不足"),
    SERVER_ERROR(false,502,"系统繁忙，请稍后再试");

    //用户操作返回码
    //企业操作返回码
    //权限操作返回码
    //其他操作返回码


    boolean success;
    int code;
    String message;

    ResultCode(boolean success,int code,String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}