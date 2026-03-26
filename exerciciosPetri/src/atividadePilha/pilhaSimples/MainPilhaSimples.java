package atividadePilha.pilhaSimples;

public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples();

        pilhaSimples.inicializa();

        PilhaSimples pilha = new PilhaSimples(3);

        pilha.empilhar("Erick");
        pilha.empilhar("Ana");
        pilha.empilhar("Beatriz");

        System.out.println();
        pilha.exibirElementos();

        System.out.println();
        pilha.desempilharp();

        System.out.println();
        pilha.exibirElementos();
    }
}
