package com.nagasundar.managementsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagasundar.managementsystem.services.RecipientService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DeleteController {
    @Autowired
    private RecipientService recipientService;
    
    @DeleteMapping("/{rid}")
    public String deleteRecipient(@PathVariable int rid) {
        return recipientService.deleteRecipientById(rid);
    }
}
