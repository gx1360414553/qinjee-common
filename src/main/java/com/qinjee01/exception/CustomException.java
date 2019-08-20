package com.qinjee01.exception;


import com.qinjee01.model.response.ResultCode;

/**
 * 自定义业务异常类型
 *
 **/
public class CustomException extends RuntimeException {

    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode(){
        return resultCode;
    }


}
