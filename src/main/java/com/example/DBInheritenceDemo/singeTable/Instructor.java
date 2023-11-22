package com.example.DBInheritenceDemo.singeTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Instructor extends UserForSingle{
    private double instructorRating;
}
