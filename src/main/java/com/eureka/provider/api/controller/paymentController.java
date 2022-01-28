package com.eureka.provider.api.controller;

import org.apache.http.protocol.HTTP;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class paymentController {


    @GetMapping("/amount")
    public ResponseEntity<Integer> getPayment(){
        int amount = 1100;
        return ResponseEntity.ok(amount);
    }
}
