package com.example.testweb.service;

import com.example.testweb.model.Bouquet;
import com.example.testweb.model.Bouquet_Activite;
import com.example.testweb.model.Employee;
import com.example.testweb.repository.BouquetActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BouquetActiviteService {
    @Autowired
    private BouquetActiviteRepository bouquetActiviteRepository;

    public void saveBouquetActivite(Bouquet_Activite bouquet) {
        int sequence = bouquetActiviteRepository.getNextVal();
        String id = bouquetActiviteRepository.getSequence(3,"BACT",sequence);
        bouquet.setIdBouquetActivite(id);
        bouquetActiviteRepository.save(bouquet);
    }

    public List<Bouquet_Activite> getAllActivite() {
        return bouquetActiviteRepository.findAll();
    }

    public Optional<Bouquet_Activite> getById(String id) {
        return bouquetActiviteRepository.findById(id);
    }
}
