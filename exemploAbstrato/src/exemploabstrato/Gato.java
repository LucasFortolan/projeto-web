package exemploabstrato;

public class Gato extends Animal implements IAnimalCarinho{
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void mover() {
        System.out.println("Gato pulando de muro em muro!");
    }
    @Override
    public void alimentar() {
        System.out.println("Gato esta se alimentando de passarinho");
    }
    @Override
    public void receberCarinho() {
        System.out.println("Gato esta recebendo carinho na barriga!");
    }
}
