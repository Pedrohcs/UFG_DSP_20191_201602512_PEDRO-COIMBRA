package br.com.pedrohcs.dsp20191.aulas0104.as;

public class Main {

    public static void main(String[] args) {
        Crud crud = new Crud();
        String resultado;

        resultado = crud.write();
        System.out.println(resultado);
        System.out.println("\nInformação contina no arquivo: \n");
        resultado = crud.read();
        System.out.println(resultado);

        ManipularTxt manipular = new ManipularTxt(crud.getFilename());

        System.out.println("\nNovas informações contidas no arquivo: \n");
        resultado = manipular.read();
        System.out.println(resultado);

        System.out.println("\nArquivo CSV: \n");
        CSV csv = new CSV();
        csv.init();
    }
}
