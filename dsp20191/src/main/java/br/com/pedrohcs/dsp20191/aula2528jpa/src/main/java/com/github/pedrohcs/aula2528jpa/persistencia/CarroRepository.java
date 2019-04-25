package com.github.pedrohcs.aula2528jpa.persistencia;

import com.github.pedrohcs.aula2528jpa.model.Carro;

import java.util.List;

public interface CarroRepository {

    Carro create(Carro carro);

    Carro read(Long id);

    List<Carro> findByModelo(String modelo);

    Carro update(Carro carro);

    void delete(Carro carro);

    void close();
}
