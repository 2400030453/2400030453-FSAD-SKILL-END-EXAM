package com.klef.fsad.fsadend.exam.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Hospital 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String status;

    // getters and setters
}