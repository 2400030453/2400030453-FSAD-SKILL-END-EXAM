package com.klef.fsad.fsadendexam1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.fsadendexam1.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>
{
}