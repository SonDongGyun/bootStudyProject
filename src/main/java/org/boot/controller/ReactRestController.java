package org.boot.controller;

import org.boot.domain.WM_SUBJECT_COUPON;
import org.boot.service.ReactPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReactRestController {
    @Autowired
    private ReactPostService postService;

    @CrossOrigin
    @PostMapping(value="/testData")
    public Map<Integer, String> testData(@RequestBody List<String> params){
        System.out.println(1111111);
        System.out.println(params);
        Map<Integer, String> data = new HashMap<>();
        data.put(1,"사과");
        data.put(2,"포도");
        data.put(3,"바나나");

        int i = 4;
        for(String param : params){
            data.put(i, param);
            i++;
        }

        return data;
    }

//    @CrossOrigin
//    @PostMapping("/postReact")
//    public ResponseEntity<?> save(@RequestBody WM_SUBJECT_COUPON post) {
//        return new ResponseEntity<>(postService.save(post), HttpStatus.CREATED);
//    }

    @CrossOrigin
    @GetMapping("/postReact")
    public ResponseEntity<?> findAll(@RequestBody WM_SUBJECT_COUPON post) {
        System.out.println(111111);
        System.out.println(post);
        return new ResponseEntity<>(postService.findAll(), HttpStatus.OK);
    }
}