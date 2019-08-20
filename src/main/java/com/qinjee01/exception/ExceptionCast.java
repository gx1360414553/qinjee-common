package com.qinjee01.exception;


import com.qinjee01.model.response.ResultCode;

/**
 * 异常抛出类
 */
public class ExceptionCast {

    /**
     * 抛出异常
     * @param resultCode
     */
    public static void cast(ResultCode resultCode){
        throw new CustomException(resultCode);
    }
}