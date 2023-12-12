package com.example.testweb.service;

import com.example.testweb.model.Activite;
import com.example.testweb.repository.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActiviteService {
    @Autowired
    private ActiviteRepository activiteRepository;

    public void saveActivite(Activite activite) {
        int sequence = activiteRepository.getNextVal();
        String id = activiteRepository.getSequence(3,"ACT",sequence);
        activite.setIdActivite(id);
        activiteRepository.save(activite);
    }

    public List<Activite> getAllActivite() {
        return activiteRepository.findAll();
    }

    public Optional<Activite> getById(String id) {
        return activiteRepository.findById(id);
    }

}
