    package db;

import java.sql.Connection;
import modelo.Tarefa;

public class ConexaoBancoReal implements ConexaoBanco {
    private Connection conexao;
    private String URL;
    private String USER;
    private String PASSWORD;
    
    @Override
    public void conectar() {
        System.out.println("Conexão Realizada! Seja bem-vindo ao Conexão Banco Real");
    }
    
    @Override
    public void desconectar() {
        System.out.println("Até mais! Desconexão do Banco Real Realizada!");
    }
    
    @Override
    public void salvarTarefa(Tarefa tarefas) {
        System.out.println("Salvo com sucesso!");
    }
    
    @Override
    public void listarTarefas() {
        System.out.println("Banco de Dados Real com SQL");
    }
}