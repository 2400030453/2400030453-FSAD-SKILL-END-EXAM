package com.klef.fsad.fsadend.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.fsadend.exam.entity.Hospital;
import com.klef.fsad.fsadend.exam.service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController 
{
    @Autowired
    private HospitalService service;

    @PostMapping("/add")
    public Hospital addHospital(@RequestBody Hospital h)
    {
        return service.saveHospital(h);
    }

    @GetMapping("/{id}")
    public Hospital getHospital(@PathVariable int id)
    {
        return service.getHospital(id);
    }
} 