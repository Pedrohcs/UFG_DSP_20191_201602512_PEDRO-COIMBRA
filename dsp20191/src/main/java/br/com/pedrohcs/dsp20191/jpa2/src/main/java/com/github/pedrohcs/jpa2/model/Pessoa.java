package com.github.pedrohcs.jpa2.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Pessoa implements EntidadeBase{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pessoa_id")
    private Long id;

    private String nome;
    private int idade;

    public Long getId() {
        return this.id;
    }
}
