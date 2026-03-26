package provaMarcelo.sistemaVeiculo;

public class Moto extends VeiculoMotorizado{
    private int cilindradas;

    public Moto(String placa, String modelo, double valorDiaria, boolean locado, int ano, int cilindradas) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

    public String toString(){
        return String.format(
                "Tipo: %s | Placa: %s | Modelo: %s | Valor da Diária: %.2f | Locado: %s | Ano: %d | Cilindradas: %d",
                getTipo(), getPlaca(), getModelo(), getValorDiaria(), isLocado(), getAno(), cilindradas
        );
    }
}
