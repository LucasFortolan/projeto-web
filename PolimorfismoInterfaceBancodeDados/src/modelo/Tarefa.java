package modelo;

public abstract class Tarefa {
    
    protected String descricao;
    
    
    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    

    public abstract void exibirdetalhes();
}
