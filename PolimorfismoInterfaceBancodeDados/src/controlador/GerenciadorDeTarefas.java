package controlador;

import db.ConexaoBanco;
import modelo.Tarefa;

public class GerenciadorDeTarefas {
    private ConexaoBanco conexaoBanco; // private classe variavel
    
    public GerenciadorDeTarefas(ConexaoBanco conexao) {
        this.conexaoBanco = conexao;
    }
    
    public void conectar() {
        conexaoBanco.conectar();
    }
    
    public void desconectar() {
        conexaoBanco.desconectar();
    }
    
    public void adicionarTarefa(Tarefa tarefa) {
        conexaoBanco.salvarTarefa(tarefa);
    }
    
    public void exibirTarefas() {
        conexaoBanco.listarTarefas();
    }
}