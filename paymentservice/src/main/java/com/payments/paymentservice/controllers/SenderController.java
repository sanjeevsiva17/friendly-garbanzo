package com.payments.paymentservice.controllers;

import com.payments.paymentservice.models.Escrow;
import org.springframework.beans.factory.annotation.Autowired;

import com.payments.paymentservice.services.SenderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1")
public class SenderController {

    private SenderService senderService;

    @Autowired
    public SenderController(SenderService senderService){
        this.senderService = senderService;
    }


    @CrossOrigin
    @PostMapping("/amount")
    public ResponseEntity<Escrow> postAmount(@RequestBody Escrow escrow){
        try {
            return new ResponseEntity<>(senderService.postAmount(escrow), HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<Escrow>(HttpStatus.BAD_GATEWAY);
        }

    }

}
