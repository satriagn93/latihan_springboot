package com.spring1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring1.models.entities.Penugasan;
import com.spring1.models.repos.PenugasanRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PenugasanService {
    
    @Autowired
    private PenugasanRepo penugasanRepo;

    public Iterable<Penugasan> findAll(){
        return penugasanRepo.findAll();
    }


}
