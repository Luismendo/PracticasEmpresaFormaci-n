package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ciudad {
    private String name;
    private int num_habitantes;

    public Ciudad(String name, int num_habitantes) {
        this.name = name;
        this.num_habitantes = num_habitantes;
    }
    public Ciudad() {
    }
}
