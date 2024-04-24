package com.digitalmarketing.client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    private int clientId;
    private String companyName;
    private String clientName;
    private int totalcampaigns;
    private int totalbudget;
    private String email;
    private String phNo;
    
}
