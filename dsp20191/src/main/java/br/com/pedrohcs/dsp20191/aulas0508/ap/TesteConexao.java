package br.com.pedrohcs.dsp20191.aulas0508.ap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TesteConexao {

    public static void main(String args[]){
        Properties props = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream(
                    "./src/main/resources/conexao.properties");
            props.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Usuario usuario = new Usuario();
        Conexao conexao = new Conexao();

        usuario.setLogin(props.getProperty("usuario"));
        usuario.setNome(props.getProperty("nome"));
        usuario.setSenha(props.getProperty("senha"));

        conexao.setSgbd(props.getProperty("sgbd"));
        conexao.setTipoConexao(props.getProperty("tipoConexao"));
        conexao.setBancoDados(props.getProperty("bancoDados"));
        conexao.setUrlBd(props.getProperty("urlBd"));

        System.out.println(usuario.toString());
        System.out.println(conexao.toString());

    }
}
