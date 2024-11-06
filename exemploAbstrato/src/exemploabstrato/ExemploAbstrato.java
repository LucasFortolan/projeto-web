package exemploabstrato;

public class ExemploAbstrato {

    public static void main(String[] args) {
        
        /* CLASSE ABSTRATA NÃO pode ter instancia de objeto
        Animal animal = new Animal("Mascote", 2);
        animal.getInformacoes();
        */
        // Qualquer animal recebe um tipo especifico
            // Animal esta recebendo um cachorro
            
        /*
        Cachorro cao = new Cachorro("Cao de briga", 5);
        cao.getInformacoes();
        
        Peixe peixe = new Peixe("Nemo", 25);
        peixe.getInformacoes();
        
        Gato gato = new Gato("Garfield ", 46);
        gato.getInformacoes();
        */
        // Animal não esta sendo instanciada, esta apenas guardando uma referencia dos cachorros, gatos e peixes
        // Permite criar um array e ser todos armazenados
        Animal cao = new Cachorro("Cao de briga", 5);
        cao.getInformacoes();
        ((Cachorro)cao).receberCarinho(); // "Cast" - Força que o cao, seja tratado como
        // Cachorro e possa utilizar a implementação da Interface "receberCarinho()"
        // cao.receberCarinho();
        /* Não é permitido dessa forma, pois a classe Animal não recebeu a 
        implementação da Interface.
        */
        Animal peixe = new Peixe("Nemo", 25);
        peixe.getInformacoes();
        
        Animal gato = new Gato("Garfield ", 46);
        gato.getInformacoes();
        ((Gato)gato).receberCarinho();
        
        IAnimalCarinho cachorro = new Cachorro("IAnimal", 9);
        cachorro.receberCarinho();
    }
    
}
