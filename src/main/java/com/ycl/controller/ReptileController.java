package com.ycl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : YangChunLong
 * @date : Created in 2020/5/7 22:41
 * @description:
 * @modified By:
 * @version: :
 */
@Controller
@RequestMapping(value = "/v1/reptile")
public class ReptileController {
    @RequestMapping(value = "/demo")
    @ResponseBody
    public String reptileDemo (){
        return "";
    }
}
