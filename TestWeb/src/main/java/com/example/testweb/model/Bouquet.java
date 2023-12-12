package com.example.testweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bouquet {
    @Id
    @Column(name="idbouquet")
    private String idBouquet;
    @Column(name="nombouquet")
    private String nomBouquet;
}
