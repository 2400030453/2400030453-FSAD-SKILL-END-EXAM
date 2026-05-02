package com.klef.fsad.fsadend.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.fsadend.exam.entity.Hospital;
import com.klef.fsad.fsadend.exam.repository.HospitalRepository;

@Service
public class HospitalService 
{
    @Autowired
    private HospitalRepository repo;

    public Hospital saveHospital(Hospital h)
    {
        return repo.save(h);
    }

    public Hospital getHospital(int id)
    {
        return repo.findById(id).orElse(null);
    }
}