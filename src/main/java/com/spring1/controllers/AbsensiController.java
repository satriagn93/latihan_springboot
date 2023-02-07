package com.spring1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring1.models.entities.Absensi;
import com.spring1.services.AbsensiService;

// controller memanggil service,service  memanggil repository, ingat ini kawan

@RestController
@RequestMapping("/api/report_absensi")
public class AbsensiController {
    
    @Autowired
    private AbsensiService absensiService;

    @PostMapping
    public Absensi create(@RequestBody Absensi absensi){
        return absensiService.save(absensi);
    }

    @GetMapping
    public Iterable<Absensi> findAll(){
        return absensiService.findAll();
    }

    @GetMapping("/{id}")
    public Absensi findOne(@PathVariable("id") Long id){
        return absensiService.findOne(id);
    }

    @PutMapping
    public Absensi update(@RequestBody Absensi absensi){
        return absensiService.save(absensi);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id){
        absensiService.removeOne(id);
    }
}
