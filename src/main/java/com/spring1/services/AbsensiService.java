package com.spring1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring1.models.entities.Absensi;
import com.spring1.models.repos.AbsensiRepo;

import javax.transaction.Transactional;

@Service
@Transactional
public class AbsensiService {
    
    @Autowired
    private AbsensiRepo absensiRepo;

    public Absensi save(Absensi absensi){
        return absensiRepo.save(absensi);
    }

    public Absensi findOne(Long id){
        Optional<Absensi> absensi = absensiRepo.findById(id);
        if(!absensi.isPresent()){
            return null;
        }
        return absensi.get();
    }

    public Iterable<Absensi> findAll(){
        return absensiRepo.findAll();
    }

    public void removeOne(Long id){
        absensiRepo.deleteById(id);
    }


}
