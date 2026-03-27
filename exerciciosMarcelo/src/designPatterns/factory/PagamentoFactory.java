package designPatterns.factory;

import designPatterns.strategy.*;

public class PagamentoFactory {
  public static Pagamento criarPagamento(String tipoPagamento){
        if(tipoPagamento.equalsIgnoreCase("pix")){
            return new Pix();
        } else if(tipoPagamento.equalsIgnoreCase("cartao")){
            return new Cartao();
        } else if(tipoPagamento.equalsIgnoreCase("boleto")){
            return new Boleto();
        } else throw new IllegalArgumentException("Tipo de pagamento inválido!");
    } 
}
