package view;

import controlador.GerenciadorDeTarefas;

import db.ConexaoBanco;
import db.ConexaoBancoEmMemoria;
import db.ConexaoBancoReal;

import modelo.TarefaComPrazo;
import modelo.TarefaSimples;

// Classe Main para testar o sistema
public class View {
    public static void main(String[] args) {
        // Utilizando a conexão real
        ConexaoBanco conexaoReal = new ConexaoBancoReal();
        GerenciadorDeTarefas gerenciadorReal = new GerenciadorDeTarefas(conexaoReal);
        
        gerenciadorReal.conectar();
        
        gerenciadorReal.adicionarTarefa(new TarefaSimples("Estudar para a prova"));
        gerenciadorReal.adicionarTarefa(new TarefaComPrazo("Projeto de Java", "2024-12-10"));
        gerenciadorReal.exibirTarefas();
        gerenciadorReal.desconectar();
        
        System.out.println("\n---\n");
        
        // Utilizando a conexão em memória
        // interface(ConexaoBanco) assume o papel do banco em memoria
        ConexaoBanco conexaoMemoria = new ConexaoBancoEmMemoria(); // polimorfismo
        // passo o objeto para o gerenciadorDeTarefas
        GerenciadorDeTarefas gerenciadorMemoria = new GerenciadorDeTarefas(conexaoMemoria);
        gerenciadorMemoria.conectar();
        gerenciadorMemoria.adicionarTarefa(new TarefaSimples("Ler um livro"));
        gerenciadorMemoria.adicionarTarefa(new TarefaComPrazo("Fazer exercício de Java", "2024-12-15"));
        gerenciadorMemoria.exibirTarefas();
        gerenciadorMemoria.desconectar();
    }
}