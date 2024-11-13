package db;

import java.util.ArrayList;
import modelo.Tarefa;

public class ConexaoBancoEmMemoria implements ConexaoBanco {
    private ArrayList<Tarefa> tarefas = new ArrayList();
    
    @Override
    public void conectar() {
        System.out.println("Conexão Realizada!\nSeja bem-vindo ao Conexão Banco Em Memória");
    }
    
    @Override
    public void desconectar() {
        System.out.println("Até mais! Desconexão do Banco Em Memória Realizada!");
    }
    
    @Override
    public void salvarTarefa(Tarefa tf) {
        if(tarefas.add(tf)) {
            System.out.println("Salvo com sucesso!");
        }
        else {
            System.out.println("Erro ao salvar Tarefa!");
        }
    }
    
    @Override
    public void listarTarefas() {
        for (Tarefa tf: tarefas) {
            tf.exibirdetalhes();
        }
    }
}
