package com.qinjee01.model.request;

import lombok.Data;
import lombok.ToString;

/**
 * 参数接受类
 */

@Data
@ToString
public class RequestData {
    Integer pageCurrent;
    Integer pageSize;
}
