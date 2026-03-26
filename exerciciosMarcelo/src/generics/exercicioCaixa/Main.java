package generics.exercicioCaixa;

public class Main{
    public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        System.out.println("Caixa de texto vazia? " + caixaDeTexto.estaVazia());

        caixaDeTexto.guardar("Atividade de Generics");
        System.out.println("Item guardado: " + caixaDeTexto.obter());

        System.out.println("Caixa de texto vazia? " + caixaDeTexto.estaVazia());

        System.out.println();
        Caixa<Integer> caixaDeInteiro = new Caixa<>();
        System.out.println("Caixa de inteiro vazia? " + caixaDeInteiro.estaVazia());

        caixaDeInteiro.guardar(12345);
        System.out.println("Item guardado: " + caixaDeInteiro.obter());

        System.out.println("Caixa de inteiro vazia? " + caixaDeInteiro.estaVazia());
    }
}
