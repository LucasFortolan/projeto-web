
package modelo;

public class TarefaSimples extends Tarefa {
    
    public TarefaSimples (String descricao){
        super(descricao);
    }

    @Override
    public void exibirdetalhes() {
        System.out.println("Tarefa Simples: " + descricao);
    } 
}
