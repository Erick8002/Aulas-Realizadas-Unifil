package DesignPatternsPagamento.strategy;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pix();
        
        pagamento.pagar(100);
    }
}