package com.webgame.web.controller;

import javax.servlet.http.HttpServletResponse;

import com.webgame.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping(value = "/test2")
    public String tested(HttpServletResponse response){
        try{
            response.sendRedirect("/pages/test.html");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/pages/test.html";
    }
}
