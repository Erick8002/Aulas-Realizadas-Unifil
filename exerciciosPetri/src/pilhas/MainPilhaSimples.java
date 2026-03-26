package pilhas;

public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhasSimples pilha = new PilhasSimples();
        pilha.pilhaSimples(4);

        pilha.adicionarElemento("elemento1");
        pilha.adicionarElemento("elemento2");
        pilha.adicionarElemento("elemento3");
        pilha.adicionarElemento("elemento4");

        pilha.exibirElementos();
        pilha.removerElemento();
        pilha.exibirElementos();
        pilha.removerElemento();
        pilha.exibirElementos();
    }
}
