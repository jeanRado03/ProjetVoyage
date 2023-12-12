package com.example.testweb.service;

import com.example.testweb.model.Bouquet;
import com.example.testweb.model.Employee;
import com.example.testweb.repository.BouquetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BouquetService {
    @Autowired
    private BouquetRepository bouquetRepository;

    public void saveBouquet(Bouquet bouquet) {
        int sequence = bouquetRepository.getNextVal();
        String id = bouquetRepository.getSequence(3,"BQT",sequence);
        bouquet.setIdBouquet(id);
        bouquetRepository.save(bouquet);
    }

    public List<Bouquet> getAllEmp() {
        return bouquetRepository.findAll();
    }

    public Optional<Bouquet> getById(String id) {
        return bouquetRepository.findById(id);
    }
}
