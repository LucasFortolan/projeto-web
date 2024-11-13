package modelo;

public class TarefaComPrazo extends Tarefa {
    
    private String prazo;
    
    public TarefaComPrazo(String descricao, String prazo){
        super(descricao);
        this.prazo = prazo;
    }
    
    @Override//ja avisa que eh abstrato
    public void exibirdetalhes(){
        System.out.println("Tarefa com Prazo: " + getPrazo() + " Descrição: " + descricao);
    }
    
    public String getPrazo(){//preciso colocar o tipo que to getando
        return prazo;
    }


    
}
