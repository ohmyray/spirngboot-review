package com.ray.luckymoney;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ray
 */
@Controller
public class ThymeController {

    @GetMapping("/thyme")
    public String say() {
        return "index";
    }
}
