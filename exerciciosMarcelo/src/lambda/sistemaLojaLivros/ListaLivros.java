package lambda.sistemaLojaLivros;

import java.util.ArrayList;
import java.util.List;

public class ListaLivros<T extends Livro> {
    private List<T> livros = new ArrayList<>();

    public void adicionar(T livro){
        livros.add(livro);
    }

    public List<T> getLivros(){
        return livros;
    }

    public void exibirTodos(){
        livros.forEach(System.out::println);
    }

    public T maisCaro(){
        T maisCaro = livros.get(0);
        for(T livro : livros){
            if(livro.getPreco() > maisCaro.getPreco()){
                maisCaro = livro;
            }
        }
        return maisCaro;
    }

    public T maisBarato(){
        T maisBarato = livros.get(0);
        for(T livro : livros){
            if(livro.getPreco() < maisBarato.getPreco()){
                maisBarato = livro;
            }
        }
        return maisBarato;
    }

    public double mediaPreco(){
        double soma = 0;
        for(T livro : livros){
            soma += livro.getPreco();
        }
        double media = soma/livros.size();
        return media;
    }
}
