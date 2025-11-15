package provaMarcelo.sistemaVeiculo;

public abstract class VeiculoMotorizado extends Veiculo{
    private int ano;

    public VeiculoMotorizado(String placa, String modelo, double valorDiaria, boolean locado, int ano) {
        super(placa, modelo, valorDiaria, locado);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
}
