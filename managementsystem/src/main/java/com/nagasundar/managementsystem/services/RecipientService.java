package com.nagasundar.managementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagasundar.managementsystem.models.Recipient;
import com.nagasundar.managementsystem.repositories.RecipientRepo;

@Service
public class RecipientService {
   @Autowired
   private RecipientRepo recipientRepo;

    public String addRecipient(Recipient recipient) {
        recipient.setStatus("Recipient added successfully");
        recipient=recipientRepo.save(recipient);
        return "Recipient added successfully with id: "+recipient.getRecipientId();
    }

    public Recipient getRecipientById(int id) {
        Recipient recipient = recipientRepo.findById(id).orElse(null);
        return recipient;
    }

    public List<Recipient> getAllRecipients() {
        return recipientRepo.findAll();
    }

    public String deleteRecipientById(int id) {
        Recipient recipient = recipientRepo.findById(id).orElse(null);
        recipientRepo.deleteById(id);

        if (recipient == null) {
            return "Recipient " + id + " not found";
        }

        return "Recipient " + id + " deleted";
    }

    public String acceptRecipientById(int rid) {
        Recipient recipient = recipientRepo.findById(rid).orElse(null);

        if (recipient == null) {
            return "Recipient " + rid + " not found";
        }

        recipient.setStatus("Accepted by donor");
        recipientRepo.saveAndFlush(recipient);
        return "Donation " + rid + " Accepted";
    }


    public String donateRecipientById(int rid) {
        Recipient recipient = recipientRepo.findById(rid).orElse(null);

        if (recipient == null) {
            return "Recipient " + rid + " not found";
        }

        recipient.setStatus("Donation done");
        recipientRepo.saveAndFlush(recipient);
        return "Blood " + rid + " Donated";
    }

    public String updateRecipientById(int rid) {
        Recipient recipient = recipientRepo.findById(rid).orElse(null);

        if (recipient == null) {
            return "Recipient " + rid + " not found";
        }

        // recipient.setStatus("Recipient updated successfully");
        recipientRepo.saveAndFlush(recipient);
        return "Recipient " + rid + " updated";
    }
}
