package com.backend_news.news.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @GetMapping("/home")
    public String home(){
        return "Hello World";
    }
}
