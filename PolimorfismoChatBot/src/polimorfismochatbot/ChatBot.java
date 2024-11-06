package polimorfismochatbot;

public class ChatBot {
    protected String pergunta;
    public void responderPergunta(String pergunta) {
        this.pergunta = pergunta;
        System.out.print("Sua pergunta: " + pergunta);
    }
    public void cumprimentar() {
        System.out.print("Olá, meu nome é ChatBot FHO, como possoa ajudar?!");
    }
}
