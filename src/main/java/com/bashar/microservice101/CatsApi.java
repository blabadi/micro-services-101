package com.bashar.microservice101;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bashar on 2017-08-05.
 */
@RestController
@RequestMapping("/cats")
public class CatsApi {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @RequestMapping("/say")
    public Map<String, String> say() {
        Map<String, String> res = new HashMap<String, String>();
        res.put("say", "meawo");
        return res;
    }
}
