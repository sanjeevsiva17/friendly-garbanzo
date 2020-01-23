package com.escrow.escrowservice.controllers;

import com.escrow.escrowservice.models.Escrow;
import com.escrow.escrowservice.services.EscrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/profile")
public class EscrowController {
    private EscrowService escrowService;

    @Autowired
    public EscrowController(EscrowService escowService){
        this.escrowService = escowService;
    }

    @PostMapping("/create")
    public ResponseEntity<Escrow> create(@RequestBody Escrow obj) {
        return new ResponseEntity<>(escrowService.create(obj), HttpStatus.OK);
    }


}
