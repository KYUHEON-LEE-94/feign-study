package com.study.feignclient.controller;

import com.study.feignclient.util.FeignServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.study.feignclient.controller
 * fileName       : FeignDemoController
 * author         : heon
 * date           : 2024-02-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-26           heon               최초 생성
 */
@RestController
@RequestMapping("/demo")
public class FeignDemoController {
    @Autowired
    private FeignServiceUtil feignServiceUtil;

    @GetMapping("/username")
    public String GetUserName(){
        return feignServiceUtil.getName();
    }

    @GetMapping("/userAddress")
    public String GetUserAddress(){
        return feignServiceUtil.getAddress();
    }

    @GetMapping("/userStatus")
    public String GetUserStatus(){
        return feignServiceUtil.getStatus();
    }

}
