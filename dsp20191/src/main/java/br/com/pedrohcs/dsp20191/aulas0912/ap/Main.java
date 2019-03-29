package br.com.pedrohcs.dsp20191.aulas0912.ap;


public class Main {

    public static void main(String[] args) {
        System.out.println("Todos os alunos presentes na turma (XML): ");
        LerXml.ler();

        CriarXml criarXml = new CriarXml();
        criarXml.criar();
        System.out.println("Informações apenas do aluno Pedro Henrique (XML): ");
        criarXml.ler();

        EditarXml editarXml = new EditarXml();
        editarXml.alterar();
        System.out.println("Informações do aluno Pedro Henrique Alterada (XML): ");
        editarXml.ler();

        System.out.println("Todos os alnos presentes na turma (JSON): ");
        LerJson lerJson = new LerJson();
        lerJson.ler();

        System.out.println("Informações apenas do aluno Pedro Henrique (JSON): ");
        CriarJson criarJson = new CriarJson();
        criarJson.criarJson();

        System.out.println("Informações do aluno Pedro Henrique Alterada (JSON): ");
        EditarJson editarJson = new EditarJson();
        editarJson.editarJson();

    }
}
