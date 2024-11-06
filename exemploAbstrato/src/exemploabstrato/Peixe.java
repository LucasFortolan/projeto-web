package exemploabstrato;

public class Peixe extends Animal {
    public Peixe(String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void mover() {
            System.out.println("O peixe: " + nome + " esta nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("O peixe esta se alimentando no aquario!");
    }
    
}
