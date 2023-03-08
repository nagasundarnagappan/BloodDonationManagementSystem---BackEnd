package com.nagasundar.managementsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagasundar.managementsystem.models.Recipient;
import com.nagasundar.managementsystem.services.RecipientService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")

public class PostController {
    @Autowired
    private RecipientService recipientService;

    // Add Recipient
    @PostMapping("/addRecipient")
    public String addRecipient(@RequestBody Recipient recipient) {
        recipientService.addRecipient(recipient);
        return "Recipient added";
    }
}
