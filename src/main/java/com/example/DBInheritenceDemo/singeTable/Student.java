package com.example.DBInheritenceDemo.singeTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends UserForSingle{
    private double psp;
    private String batchName;
}
