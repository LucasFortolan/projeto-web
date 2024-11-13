package db;

import modelo.Tarefa;

public interface ConexaoBanco{
    public void conectar();
    public void desconectar();
    public void salvarTarefa(Tarefa tarefa);
    public void listarTarefas();
}
