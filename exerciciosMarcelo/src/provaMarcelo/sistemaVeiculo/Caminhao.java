package exerciciosMarcelo.src.provaMarcelo.sistemaVeiculo;

public class Caminhao extends VeiculoMotorizado{
    private double capacidadeToneladas;

    public Caminhao(String placa, String modelo, double valorDiaria, boolean locado, int ano, double capacidadeToneladas) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.capacidadeToneladas = capacidadeToneladas;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }

    public String toString(){
        return String.format(
                "Tipo: %s | Placa: %s | Modelo: %s | Valor da Diária: %.2f | Locado: %s | Ano: %d | Capacidade tonelada: %.2f",
                getTipo(), getPlaca(), getModelo(), getValorDiaria(), isLocado(), getAno(), capacidadeToneladas
        );
    }
}
