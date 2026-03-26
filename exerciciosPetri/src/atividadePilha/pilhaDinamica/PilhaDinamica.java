package atividadePilha.pilhaDinamica;

public class PilhaDinamica {
    private NoPilha topo;

    public PilhaDinamica() {
        this.topo = null;
    }

    public boolean vazia(){
        return (topo == null);
    }

    public void empilhar(String conteudo){
        NoPilha novoNo = new NoPilha(conteudo);
        novoNo.prox = topo;
        topo = novoNo;
    }

    public String desempilhar(){
        if(vazia()){
            System.out.println("A lista está vazia!");
        }

        String aux = topo.conteudo;
        topo = topo.prox;
        return aux;
    }

    public void exibirPilha(){
        if(vazia()){
            System.out.println("A pilha está vazia!");
            return;
        }

        System.out.println("Elementos da pilha: ");
        NoPilha atual = topo;

        while (atual != null){
            System.out.println(atual.conteudo);
            atual = atual.prox;
        }
    }

}
