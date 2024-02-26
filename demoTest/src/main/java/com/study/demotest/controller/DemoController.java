package com.study.demotest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.study.demotest.controller
 * fileName       : DemoController
 * author         : heon
 * date           : 2024-02-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-26           heon               최초 생성
 */
@RestController
@RequestMapping("/user")
public class DemoController {
    @GetMapping("/name")
    public String getName(){
        return "Play Java !";
    }

    @GetMapping("/address")
    public String getAddress(){
        return "KOREA !";
    }

    @GetMapping("/status")
    public String getStatus(){
        return "active";
    }
}
