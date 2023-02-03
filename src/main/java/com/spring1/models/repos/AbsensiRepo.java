package com.spring1.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring1.models.entities.Absensi;

public interface AbsensiRepo extends CrudRepository<Absensi, Long>{
    
    List<Absensi> findByAlasanContains(String alasan);
}
