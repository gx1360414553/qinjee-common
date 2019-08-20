package com.qinjee.response;

import com.qinjee01.model.response.ResultCode;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年08月20日 08:49:00
 */
public enum TSCCode implements ResultCode {

    TSC_NO_PERMISSION(false,24006,"没有权限，无法访问文件！");

    //操作代码
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    TSCCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
