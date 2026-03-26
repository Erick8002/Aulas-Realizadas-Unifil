package lambda.sistemaLojaLivros;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ListaLivros<Livro> livros = new ListaLivros<>();

        livros.adicionar(new Livro("Java Essencial", "Deitel", 89.90));
        livros.adicionar(new Livro("Algoritmos e Estruturas", "Cormen", 120.00));
        livros.adicionar(new Livro("Programação em Python", "Nilo Ney", 49.90));
        livros.adicionar(new Livro("Banco de Dados", "Silberschatz", 80.00));
        livros.adicionar(new Livro("Lógica de Programação", "Forbellone", 55.00));

        System.out.println("=== LISTA DE LIVROS ===");
        livros.exibirTodos();
        System.out.println();

        System.out.println("=== LIVROS ACIMA DE R$ 50,00 ===");
        List<Livro> livroAcimaCinquenta = new ArrayList<>();
        livroAcimaCinquenta = livros.getLivros().stream().filter((lvro) -> lvro.getPreco()>50.00).toList();
        for(Livro l : livroAcimaCinquenta){
            System.out.println(l.getTitulo());
        }
        System.out.println();

        System.out.println("=== TÍTULOS EM MAIÚSCULO ===");
        List<String> tituloMaiusculo = new ArrayList<>();
        tituloMaiusculo = livros.getLivros().stream().map((lvro) -> lvro.getTitulo().toUpperCase()).toList();
        for(String tm : tituloMaiusculo){
            System.out.println(tm);
        }
        System.out.println();

        System.out.println("=== ESTATÍSTICAS ===");
        System.out.println("Preço médio: " + String.format("R$%.2f", livros.mediaPreco()));
        System.out.println("Mais barato: " + livros.maisBarato().getTitulo() + " - " + String.format("R$%.2f", livros.maisBarato().getPreco()));
        System.out.println("Mais caro: " + livros.maisCaro().getTitulo() + " - " + String.format("R$%.2f", livros.maisCaro().getPreco()));
    }
}
