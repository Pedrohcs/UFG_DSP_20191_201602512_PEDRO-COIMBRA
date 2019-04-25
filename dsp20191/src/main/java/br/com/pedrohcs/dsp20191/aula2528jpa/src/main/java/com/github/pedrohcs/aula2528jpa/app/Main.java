package com.github.pedrohcs.aula2528jpa.app;

import com.github.pedrohcs.aula2528jpa.model.Carro;
import com.github.pedrohcs.aula2528jpa.persistencia.CarroRepositoryImpl;

import java.util.List;

public class Main {

    public static void main(String[] args){
        Carro relampagoMarquinhos = new Carro();
        relampagoMarquinhos.setMarca("Volkswagen");
        relampagoMarquinhos.setModelo("Gol G7 Sportline");
        relampagoMarquinhos.setAnoFabricacao(2017);
        relampagoMarquinhos.setAnoModelo(2018);
        relampagoMarquinhos.setPotenciaMotor(120);

        CarroRepositoryImpl impl = new CarroRepositoryImpl();

        System.out.println("Persistindo o veículo no banco de dados");
        impl.create(relampagoMarquinhos);

        List<Carro> carros = impl.findByModelo("Gol G7 Sportline");

        for (Carro c : carros){
            System.out.println("---------------------");
            System.out.println("Veículo encontrado pela busca:");
            System.out.println(c.toString());
        }

        System.out.println("Atualizar veículo");
        Carro carroAtt = impl.read(relampagoMarquinhos.getId());
        carroAtt.setModelo("Gol modificado com motor mais potente");
        impl.update(carroAtt);

        carros = impl.findByModelo(carroAtt.getModelo());

        for (Carro c : carros){
            System.out.println("---------------------");
            System.out.println("Veículo atualizado:");
            System.out.println(c.toString());
        }

    }
}
