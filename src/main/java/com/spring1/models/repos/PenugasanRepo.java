package com.spring1.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring1.models.entities.Penugasan;

public interface PenugasanRepo extends CrudRepository<Penugasan, Long>{
    
    List<Penugasan> findByDeskripsiContains(String deskripsi);
}
