package com.example.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food implements Serializable {
    private Long id;
    private String name;
    private Double price;
}
