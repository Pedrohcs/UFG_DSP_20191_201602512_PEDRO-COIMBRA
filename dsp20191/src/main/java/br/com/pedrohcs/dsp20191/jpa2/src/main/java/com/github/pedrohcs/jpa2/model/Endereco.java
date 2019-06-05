package com.github.pedrohcs.jpa2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Endereco implements EntidadeBase{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "endereco_id")
    private Long id;

    private String logradouro;
    private int numero;
    private String complemento;

    public Long getId() {
        return this.id;
    }
}
