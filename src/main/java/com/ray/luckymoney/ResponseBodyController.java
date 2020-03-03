package com.ray.luckymoney;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ray
 * @Controller
 * +
 * @ResponseBody
 * =
 * @RestController
 */
//@ResponseBody
@Controller
public class ResponseBodyController {

    @GetMapping("/body")
    public String say1() {
        return "index";
    }

    @GetMapping("/body2")
    @ResponseBody
    public String say2() {
        return "index";
    }
}
