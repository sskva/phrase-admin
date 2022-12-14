package ru.sskva.phraseadmin.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sskva.phraseadmin.domen.response.Response;
import ru.sskva.phraseadmin.service.AdminService;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("phrase-admin")
public class Controller {

    private final AdminService adminService;

    @GetMapping("/hello")
    public String hello() {
        String hello = "Hello, phrase-service! Version: 1.0.0";
        log.info(hello);
        return hello;
    }



    @GetMapping("/test")
    public ResponseEntity<Response> test() {

        log.info("START endpoint test");
        ResponseEntity<Response> resp = adminService.test();
        log.info("END endpoint test, response: {}", resp);
        return resp;
    }
}
