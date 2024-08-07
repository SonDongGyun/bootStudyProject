package org.boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/")
public class MainController {
    @GetMapping("check")
    public String check() {
        return "Success";
    }
}
