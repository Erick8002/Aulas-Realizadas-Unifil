package exerciciosMarcelo.src.provaMarcelo.sistemaVeiculo;

public class Carro extends VeiculoMotorizado{
    private int quantidadePorta;

    public Carro(String placa, String modelo, double valorDiaria, boolean locado, int ano, int quantidadePorta) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.quantidadePorta = quantidadePorta;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    public String toString(){
        return String.format(
                "Tipo: %s | Placa: %s | Modelo: %s | Valor da Diária: %.2f | Locado: %s | Ano: %d | Quantidade de Portas: %d",
                getTipo(), getPlaca(), getModelo(), getValorDiaria(), isLocado(), getAno(), quantidadePorta
        );
    }
}
