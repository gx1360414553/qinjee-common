package com.qinjee01.exception;


import com.qinjee01.model.response.ResultCode;

/**
 * 自定义异常类型
 *
 **/
public class BusinessException extends RuntimeException {

    /**
     * 错误代码
     */
    ResultCode resultCode;

    public BusinessException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode(){
        return resultCode;
    }


}
