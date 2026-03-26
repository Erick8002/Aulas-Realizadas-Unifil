package exerciciosMarcelo.src.exercicioCompleto.processamentosDePedidosOnline;

public class PedidoOnline extends Produto{
    private int quantidade;

    public PedidoOnline(int id, String nome, double preco, int quantidade) {
        super(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public void transacionar(Double quantidade) throws TransacaoInvalidaException {
        super.transacionar(quantidade);
    }

    @Override
    public double calcularValorTotal() {
        return this.preco * this.quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public String toString(){
        return String.format(
                "Pedido ID %d: %s(%dx), Total: %.2f",
                id, nome, quantidade, calcularValorTotal()
        );
    }
}
