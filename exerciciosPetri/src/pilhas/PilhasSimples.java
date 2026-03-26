package pilhas;

public class PilhasSimples {
    String[] pilha;

    public void pilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
    }

    public void exibirElementos() {
        for (int i = this.pilha.length - 1; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }

    public void adicionarElemento(String elemento) {
        if (!estaCheia()){
            this.pilha[encontrarPosicaoVazia()] = elemento;
            System.out.println("Elemento " + elemento + " adicionado com sucesso!");
        }
    }


    private boolean estaCheia() {
        for (int i = 0; i < this.pilha.length; i++) {
            if (this.pilha[i] == null) {
                return false;
            }
        }
        System.out.println("A pilha está cheia!");
        return true;
    }

    private boolean estaVazio() {
        for (int i = 0; i < this.pilha.length; i++) {
            if (this.pilha[i] != null) {
                return false;
            }
        }
        System.out.println("A pilha está vazia!");
        return true;
    }

    private int encontrarPosicaoVazia() {
        int i;
        for (i = 0; i < this.pilha.length; i++) {
            if (this.pilha[i] == null) {
                return i;
            }
        }
        return i;
    }

    public void removerElemento() {
        if(estaCheia()){
            for(int i = pilha.length - 1; i >= 0; i--){
                if(pilha[i] != null){
                    pilha[i] = null;
                    return;
                }
            }
        }


//        if (!estaVazio()) {
//            int aux = this.pilha.length - 1;
//            if (this.pilha[aux] != null) {
//                this.pilha[aux] = null;
//                System.out.println("Elemento " + this.pilha[aux] + " removido com sucesso!");
//
//            }
//        }
    }

    public int buscarElemento(String elemento){
        int i;
        if (!estaVazio()) {
            for (i = 0; i < this.pilha.length; i++) {
                if (this.pilha[i].equals(elemento)) {
                    return i;
                }
            }
        }
        System.out.println("Elemento não encontrado na pilha.");
        return -1;
    }

    public void alterarElemento(String elementoASerAlterado, String alteracao) {
        if(buscarElemento(elementoASerAlterado) >= 0) {
            this.pilha[buscarElemento(elementoASerAlterado)] = alteracao;
            System.out.println("Elemento " + elementoASerAlterado + " alterado com sucesso para " + alteracao);
        }
    }

    public void quantidadeElementos() {
        int cont = 0;
        if(!estaVazio()) {
            for (int i = 0; i < this.pilha.length; i++) {
                if(this.pilha[i] != null) {
                    cont++;
                }
            }
        }
        System.out.println("A pilha possui " + cont + " elementos!");
    }
}
