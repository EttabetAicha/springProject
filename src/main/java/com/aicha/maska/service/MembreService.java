package com.aicha.maska.service;

import com.aicha.maska.domain.Membre;
import com.aicha.maska.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembreService {

    @Autowired
    private MembreRepository membreRepository;


    public void addMembre(Membre membre) {
        membreRepository.save(membre);
    }


    public List<Membre> getAllMembres() {
        return membreRepository.findAll();
    }

    public Optional<Membre> getMembreById(Integer id) {
        return membreRepository.findById(id);
    }
    public  void deleteMembre(Integer id){
        membreRepository.deleteById(id);
    }


}