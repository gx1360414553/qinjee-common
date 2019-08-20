package com.qinjee.exception;

import com.qinjee.response.TSCCode;
import com.qinjee01.exception.ExceptionCatch;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.nio.file.AccessDeniedException;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年08月20日 08:43:00
 */
@ControllerAdvice//控制器增强
public class CustomExceptionCatch  extends ExceptionCatch {
    static {
        builder.put(AccessDeniedException.class, TSCCode.TSC_NO_PERMISSION);
    }
}
