package com.inus.bjtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {

    @GetMapping("/")
    public ResponseEntity<Void> home() {
        log.info(" health-check url 요청됨 ");

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/health-check")
    public ResponseEntity<Void> checkHealthStatus() {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/test")
    public String test() {
        return "testPage";
    }
}
