package org.boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("check")
    public String check() {
        return "Success";
    }
}
