package com.nagasundar.managementsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagasundar.managementsystem.services.RecipientService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")

public class PutController {
    @Autowired
    private RecipientService recipientService;

    @PutMapping("/accept/{rid}")
    public String acceptRecipientById(@PathVariable int rid) {
        return recipientService.acceptRecipientById(rid);
    }

    @PutMapping("/donated/{rid}")
    public String donateRecipientById(@PathVariable int rid) {
        return recipientService.donateRecipientById(rid);
    }

    @PutMapping("/update/{rid}")
    public String updateRecipientById(@PathVariable int rid) {
        return recipientService.updateRecipientById(rid);
    }    
}
