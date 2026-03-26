package atividadePilha.pilhaDinamica;

public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar("Erick");
        pilhaDinamica.empilhar("Ana");
        pilhaDinamica.empilhar("Beatriz");

        pilhaDinamica.exibirPilha();

        System.out.println();
        System.out.println("Desempilhando um elemento.");
        pilhaDinamica.desempilhar();

        System.out.println("Exibindo a pilha após desempilhar: ");
        pilhaDinamica.exibirPilha();
    }
}
