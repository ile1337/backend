package com.example.backend.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity

public class Switch {
    @Id
    @Column(name = "switch_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer grams;

    public Switch() {
    }

    public Switch(Long id, String name, Integer grams) {
        this.id = id;
        this.name = name;
        this.grams = grams;
    }
}
