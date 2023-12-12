package com.example.testweb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="bouquet_activite")
@Data
public class Bouquet_Activite {
    @Id
    @Column(name="idbouquetactivite")
    private String idBouquetActivite;
    @ManyToOne
    @JoinColumn(name="idbouquet")
    private Bouquet bouquet;
    @ManyToOne
    @JoinColumn(name="idactivite")
    private Activite activite;
}
