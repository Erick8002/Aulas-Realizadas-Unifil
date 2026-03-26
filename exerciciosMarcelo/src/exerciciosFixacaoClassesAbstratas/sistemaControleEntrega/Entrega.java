package exerciciosMarcelo.src.exerciciosFixacaoClassesAbstratas.sistemaControleEntrega;

public abstract class Entrega {
    private String codigoPedido;

    public Entrega(String codigoPedido){
        this.codigoPedido = codigoPedido;
    }

    public String getCodigoPedido(){
        return codigoPedido;
    }

    public abstract double calcularValorFrete();

    public String exibirResumo(){
        return String.format(
                "Código do Pedido: %s%n" +
                        "Valor final do frete: %.2f%n",
                getCodigoPedido(), calcularValorFrete()
        );
    }
}