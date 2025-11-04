package exerciciosFixacaoClassesAbstratas.sistemaControleEntrega;

public class EntregaLocal extends Entrega{
    public EntregaLocal(String codigoPedido){
        super(codigoPedido);
    }

    @Override
    public double calcularValorFrete() {
        return 10.00;
    }

    @Override
    public String exibirResumo() {
        return String.format("Entrega Local: %n%s", super.exibirResumo());
    }
}
