package org.boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("check")
    public String check() {
        System.out.println(22222222);
        return "Success";
    }
}
