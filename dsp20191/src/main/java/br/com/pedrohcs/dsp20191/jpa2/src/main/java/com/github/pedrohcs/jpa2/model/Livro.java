package com.github.pedrohcs.jpa2.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Livro implements EntidadeBase{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "livro_id")
    private Long id;

    private String nome;
    private String autor;
    private int edicao;
    private int anoPublicacao;

    public Long getId() {
        return this.id;
    }
}
