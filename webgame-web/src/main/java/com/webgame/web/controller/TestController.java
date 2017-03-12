package com.webgame.web.controller;

import com.webgame.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeus Feng on 2017/3/12.
 *
 * @author Zeus Feng
 * @date 2017/03/12
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/test1")
    public String testing(){
        return testService.getTest();
    }
}
