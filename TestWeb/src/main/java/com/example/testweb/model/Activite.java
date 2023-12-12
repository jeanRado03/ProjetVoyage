package com.example.testweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Activite {
    @Id
    @Column(name="idactivite")
    private String idActivite;
    private String activite;
}
