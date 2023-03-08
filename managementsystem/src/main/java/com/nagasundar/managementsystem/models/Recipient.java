package com.nagasundar.managementsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name="recipients_samples")
@Data
@Getter
public class Recipient {
    @Id
    @GeneratedValue
    private int recipientId;
    private String recipientName;
    private String recipientEmail;
    private String recipientPhone;
    private String recipientAddress;
    private String bloodGroup;
    private String status;
}

//insert into recipients values(1, 'Nagasundar', 'abc@gmail.com', '1234567890', 'Chennai', 'A+', 'Available');



