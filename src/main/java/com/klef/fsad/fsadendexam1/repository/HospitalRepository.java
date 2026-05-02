package com.klef.fsad.fsadend.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.fsadend.exam.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>
{
}