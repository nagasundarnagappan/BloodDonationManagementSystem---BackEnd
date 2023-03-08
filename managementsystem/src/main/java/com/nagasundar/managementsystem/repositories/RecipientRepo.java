package com.nagasundar.managementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagasundar.managementsystem.models.Recipient;

public interface RecipientRepo extends JpaRepository<Recipient, Integer> {
    
}
