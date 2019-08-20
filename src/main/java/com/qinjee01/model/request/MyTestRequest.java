package com.qinjee01.model.request;

import lombok.Data;
import lombok.ToString;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年08月19日 17:40:00
 */
@Data
@ToString
public class MyTestRequest extends RequestData{
    private Integer id;
    private String name;
}
