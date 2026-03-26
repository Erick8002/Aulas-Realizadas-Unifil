package atividadePilha.pilhaSimples;

public class PilhaSimples {
    private int topo;
    private String pilha[];
    private int capacidade;

    public PilhaSimples(){ }

    public PilhaSimples(int capacidade){
        this.capacidade = capacidade;
        this.pilha = new String[capacidade];
        this.topo = -1;
    }

    public void inicializa(){
        this.pilha = new String[0];
    }

    public boolean isVazia(){
        return topo == -1;
    }

    public boolean isCheia(){
        return topo == capacidade - 1;
    }

    public void empilhar(String elemento){
        if(isCheia()){
            System.out.println("Pilha está cheia!");
            return;
        }
        topo++;
        pilha[topo] = elemento;
    }

    public String desempilharp(){
        if(isVazia()){
            System.out.println("A pilha está vazia!");
            return null;
        }

        String valor = pilha[topo];
        topo--;
        System.out.println("Desempilhando um elemento da pilha");
        return valor;
    }

    public void exibirElementos(){
        System.out.println("Exibindo a pilha: ");
        for(int i = topo; i >= 0; i--){
            System.out.println(pilha[i]);
        }
    }
}
