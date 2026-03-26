package exerciciosMarcelo.src.exercicioCompleto.gerenciadorDeAtivos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAtivos {
    public static void main(String[] args) {
        System.out.println("---- Iniciando Gerenciadore ativos ----");
        List<AtivoDigital> carteira = new ArrayList<>();

        Criptomoeda bitcoin = new Criptomoeda("Bitcoin", 95000);
        Criptomoeda ethereum = new Criptomoeda("Ethereum", 3200);

        carteira.add(bitcoin);
        carteira.add(ethereum);

        System.out.println("Valor Inicial do Bitcoin: $" + String.format("%.2f", bitcoin.getValorAtual()));
        System.out.println("Valor Inicial do Ethereum: $" + String.format("%.2f", ethereum.getValorAtual()));

        System.out.println("Tentativa de transação no bitcoin: ");
        try{
            bitcoin.transacionar(-100.00);
        }catch (TransacaoInvalidaException e){
            System.out.println("Erro capturado: " + e.getMessage());
        } catch (Exception e){
            System.out.println("\nErro desconhecido: " + e.getMessage());
        }

        try{
            System.out.println("Tentativa de transação do Ethereum: ");
            ethereum.transacionar(600.00);
        }catch (TransacaoInvalidaException e){
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("Carteira Atualizada: ");
        for(AtivoDigital ativo : carteira){
            System.out.println(ativo.toString());
        }
    }
}
