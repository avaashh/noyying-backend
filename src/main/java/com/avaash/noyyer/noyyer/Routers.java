package com.avaash.noyyer.noyyer;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class Routers {

    @GetMapping("/")
    public HashMap<String, String> hello() {

        HashMap<String, String> response = new HashMap<String, String>();
        response.put("status", "200");
        return response;
    }
}
