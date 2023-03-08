package com.nagasundar.managementsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagasundar.managementsystem.models.Recipient;
import com.nagasundar.managementsystem.services.RecipientService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class GetController {
    @Autowired
    private RecipientService recipientService;
    
    
    @GetMapping("/{rid}")
    public Recipient getOrderById(@PathVariable int rid) {
        return recipientService.getRecipientById(rid);
    }

    
    @GetMapping("/")
    public List<Recipient> getAllOrders() {
        return recipientService.getAllRecipients();
    }
}
