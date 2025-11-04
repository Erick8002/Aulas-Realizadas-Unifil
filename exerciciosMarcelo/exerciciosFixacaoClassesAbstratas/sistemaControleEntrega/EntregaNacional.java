package exerciciosFixacaoClassesAbstratas.sistemaControleEntrega;

public class EntregaNacional extends Entrega{
    private double distancia;

    public EntregaNacional(String codigoPedido, double distancia){
        super(codigoPedido);
        this.distancia = distancia;
    }

    @Override
    public double calcularValorFrete() {
        return distancia * 1.5;
    }

    @Override
    public String exibirResumo() {
        return String.format("Entrega Nacional: %n%s", super.exibirResumo());
    }
}
