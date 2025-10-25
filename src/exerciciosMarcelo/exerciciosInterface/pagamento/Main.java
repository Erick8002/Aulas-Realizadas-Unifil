package exerciciosMarcelo.exerciciosInterface.pagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento cartao = new PagamentoCartao(0.03);

        cartao.pagar(10000);
        System.out.println("----------");

        Pagamento pix = new PagamentoPix();
        pix.pagar(50);
    }
}
