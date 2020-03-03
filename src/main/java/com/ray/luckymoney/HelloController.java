package com.ray.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by Ray
 */
@RestController
public class HelloController {

//    @Value ("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value ("${description}")
//    private String description;

    @Autowired
    private LimitConfig limitConfig;

    //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    //    @GetMapping({"/hello","/hi"})
    @GetMapping("/hello")
    public String say() {
        return "说明: " + limitConfig.getDescription ( );
    }
}
