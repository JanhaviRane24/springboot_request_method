package com.requestmethod.requestmethod;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {


    @RequestMapping("RM")
    public static String requestMethodName() {
        return "request method ";
    }
    
    
}
