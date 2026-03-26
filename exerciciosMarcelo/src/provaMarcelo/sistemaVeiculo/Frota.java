package exerciciosMarcelo.src.provaMarcelo.sistemaVeiculo;

import java.util.ArrayList;
import java.util.List;

public class Frota<T extends Veiculo> {
    private List<T> veiculos = new ArrayList<>();

    public void adicionar(T veiculo){
        veiculos.add(veiculo);
    }

    public List<T> getVeiculos() {
        return veiculos;
    }

    public void exibirTodos(){
        veiculos.forEach(System.out::println);
    }

    public T buscarMaisCaro(){
        T maisCaro = veiculos.get(0);
        for(T veiculo : veiculos){
            if(veiculo.getValorDiaria() > maisCaro.getValorDiaria()){
                maisCaro = veiculo;
            }
        }
        return maisCaro;
    }

    public T buscarMenorPreco(){
        T maisBarato = veiculos.get(0);
        for(T veiculo : veiculos){
            if(veiculo.getValorDiaria() < maisBarato.getValorDiaria()){
                maisBarato = veiculo;
            }
        }
        return maisBarato;
    }
}
