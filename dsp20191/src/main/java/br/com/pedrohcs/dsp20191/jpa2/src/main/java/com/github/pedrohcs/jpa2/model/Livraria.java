package com.github.pedrohcs.jpa2.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Livraria implements EntidadeBase{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "livraria_id")
    private Long id;

    private String nome;
    private String endereco;


    public Long getId() {
        return this.id;
    }
}
