package org.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @GetMapping("/temp")
    public String check() {
        return "index";
    }
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
