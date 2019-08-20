package com.qinjee.controller;

import com.qinjee.response.TSCCode;
import com.qinjee01.exception.ExceptionCast;
import com.qinjee01.model.request.MyTestRequest;
import com.qinjee01.model.response.*;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年08月19日 17:33:00
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/add")
    public ResponseData<String> add(MyTestRequest myTestRequest) throws AccessDeniedException {
        System.out.println("id：" + myTestRequest.getId());
        if(myTestRequest.getId() == null){
            throw new AccessDeniedException("");
        }
        return new ResponseData<>(TSCCode.TSC_NO_PERMISSION,"");
    }

    @RequestMapping("/update")
    public ResponseResult update(MyTestRequest myTestRequest){
        System.out.println("id：" + myTestRequest.getId());
        if(myTestRequest.getId() == null){
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }
        return ResponseResult.SUCCESS();
    }

    @RequestMapping("/getUserList")
    public PageResponseData<String> getUserList(MyTestRequest myTestRequest){
        System.out.printf("当前页：" + myTestRequest.getPageCurrent() + ",每页大小：" + myTestRequest.getPageSize() + ",姓名：" + myTestRequest.getName());
        PageResult<String> queryResul = new PageResult<>();
        List<String> list = new ArrayList<>();
        list.add("张三");
        queryResul.setList(list);
        queryResul.setTotal(5);
        PageResponseData<String> pageResponseData = new PageResponseData<>(CommonCode.SUCCESS,queryResul);
        return pageResponseData;
    }

}
