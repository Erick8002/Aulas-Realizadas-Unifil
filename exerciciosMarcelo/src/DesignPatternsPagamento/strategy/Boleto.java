package DesignPatternsPagamento.strategy;

public class Boleto implements Pagamento{
    
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento via Boleto no valor de: R$" + valor);
    }

}
