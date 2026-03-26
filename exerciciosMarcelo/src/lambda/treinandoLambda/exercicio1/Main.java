package exerciciosMarcelo.src.lambda.treinandoLambda.exercicio1;

public class Main {
    public static void main(String[] args) {
        Saudacao exibirCumprimento = (nome) -> "Olá " + nome + "! Bem-vindo";
        String resultado = exibirCumprimento.cumprimentar("Erick");
        System.out.println(resultado);
    }
}
