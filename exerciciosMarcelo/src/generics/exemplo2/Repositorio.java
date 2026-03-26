package exerciciosMarcelo.src.generics.exemplo2;

import java.util.*;

public class Repositorio<T extends Produto>{
    private List<T> lista;

    public Repositorio() {
        this.lista = new ArrayList<>();
    }

    public void adicionar(T produto){
        lista.add(produto);
    }

    public void listarProdutos(){
        for(T produto : lista){
            System.out.println(produto);
        }
    }

    public T buscarPorCodigo(int codigo){
        for(T produto : lista){
            if(produto.getCodigo() == codigo){
                return produto;
            }
        }
        return null;
    }

    public T buscarMaiorPreco(){
        T maiorPreco = lista.get(0);
        for(T produto : lista){
            if(produto.getPreco() > maiorPreco.getPreco()){
                maiorPreco = produto;
            }
        }
        return maiorPreco;
    }

    public T buscarMenorPreco(){
        T menorPreco = lista.get(0);
        for(T produto : lista){
            if(produto.getPreco() < menorPreco.getPreco()){
                menorPreco = produto;
            }
        }
        return menorPreco;
    }
}
