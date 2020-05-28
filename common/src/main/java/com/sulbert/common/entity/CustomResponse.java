package com.sulbert.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Sulbert
 * Date: 2020/5/18
 * Description: 数据响应对象
 */
@Data
@NoArgsConstructor
public class CustomResponse {

    private boolean success;
    private Integer code;
    private String message;
    private Object data;

    public CustomResponse(ResultCode code){
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
    }

    public CustomResponse(ResultCode code,Object data){
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
        this.data = data;
    }

    public CustomResponse(boolean success,Integer code,String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static CustomResponse SUCCESS(){
        return new CustomResponse(ResultCode.SUCCESS);
    }

    public static CustomResponse FAIL(){
        return new CustomResponse(ResultCode.FAIL);
    }

    public static CustomResponse ERROR(){
        return new CustomResponse(ResultCode.SERVER_ERROR);
    }



}