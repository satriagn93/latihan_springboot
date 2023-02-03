package com.spring1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring1.models.entities.Penugasan;
import com.spring1.services.PenugasanService;

// controller memanggil service,service  memanggil repository, ingat ini kawan

@RestController
@RequestMapping("/api/penugasan")
public class PenugasanController {
    
    @Autowired
    private PenugasanService penugasanService;

    @GetMapping
    public Iterable<Penugasan> findAll(){
        return penugasanService.findAll();
    }
}
