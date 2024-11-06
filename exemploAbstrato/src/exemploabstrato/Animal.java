package exemploabstrato;

// É colocado abstract na classe e nos métodos abstratos
    // Métodos abstratos devem ser implementandos na classe herdade
public abstract class Animal {
    protected String nome;
    protected int idade;
    
    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // classe abstrata pode ter implemtação de métodos
    // interface nenhum método é implementado, só tem assinaturas
    
    public abstract void mover();
    public abstract void alimentar();
    
    public void getInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}


