package com.yang.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2021/7/20 15:40
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        return "ok";
    }
}
