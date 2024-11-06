package exemploabstrato;

public class Cachorro extends Animal implements IAnimalCarinho {
    public Cachorro(String nome, int idade){
        super(nome, idade); // 
    }
    @Override
    public void mover() {
        System.out.println(this.nome + " esta correndo e abanando o rabo!");
    }
    @Override
    public void alimentar() {
        System.out.println("O cachorro esta comendo racao pedigree");
    }
    @Override
    public void receberCarinho() { // Implementação
        System.out.println("O doguinho esta recebendo carinho na barriga!");
    }
}
