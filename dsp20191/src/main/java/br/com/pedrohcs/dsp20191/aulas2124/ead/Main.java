package br.com.pedrohcs.dsp20191.aulas2124.ead;

import br.com.pedrohcs.dsp20191.aulas2124.ead.model.Aluno;
import br.com.pedrohcs.dsp20191.aulas2124.ead.persistencia.Empacotamento;

public class Main {

    public static void main(String[] args){
        Aluno aluno = new Aluno();

        aluno.setNome("Pedro");
        aluno.setMatricula("201602512");
        aluno.setDisciplina("Desenvolvimento de Software Persistência");
        aluno.setFrequencia(60);
        aluno.setNota1(4.9);
        aluno.setNota2(8.9);

        Empacotamento.gravarArquivoBinario(aluno);

        //Criando outro objeto para demonstrar que a leitura do arquivo esta trazendo
        //os mesmoa atributos do objeto um.

        Aluno aluno2 = new Aluno();
        aluno2 = Empacotamento.lerArquivoBinario();


        System.out.println("Aluno ->");
        System.out.println(String.format("Nome: %s", aluno2.getNome()));
        System.out.println(String.format("Matrícula: %s", aluno2.getMatricula()));
        System.out.println(String.format("Disciplina: %s", aluno2.getDisciplina()));
        System.out.println(String.format("Frequencia: %s", aluno2.getFrequencia()));
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Avaliacao: " + aluno2.avaliacao());
    }
}
