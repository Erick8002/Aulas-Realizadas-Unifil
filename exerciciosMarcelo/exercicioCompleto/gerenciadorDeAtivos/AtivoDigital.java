package exercicioCompleto.gerenciadorDeAtivos;

public abstract class AtivoDigital implements Transacionavel<Double> {
    protected String nome;
    protected double valorEmDolar;

    public AtivoDigital(String nome, double valorEmDolar) {
        this.nome = nome;
        this.valorEmDolar = valorEmDolar;
    }

    @Override
    public Double getValorAtual() {
        return this.valorEmDolar;
    }
    @Override
    public abstract void transacionar(Double valor) throws TransacaoInvalidaException;

    @Override
    public String toString(){
        return String.format(
                "Ativo: %s, Valor: $%.2f", nome, valorEmDolar
        );
    }
}