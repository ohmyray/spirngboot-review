package com.ray.luckymoney;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class PrefixController {

    @GetMapping("/say")
    public String say(){
        return "你是什么鬼";
    }

}
