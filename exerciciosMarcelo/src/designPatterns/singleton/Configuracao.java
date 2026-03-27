package designPatterns.singleton;

public class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {}

    public static Configuracao getInstancia(){
        if(instancia == null){
            return new Configuracao();
        }
        return instancia;
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
