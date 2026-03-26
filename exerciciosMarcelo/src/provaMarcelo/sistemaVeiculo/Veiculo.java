package exerciciosMarcelo.src.provaMarcelo.sistemaVeiculo;

public abstract class Veiculo implements Identificavel, Locavel{
    protected String placa;
    protected String modelo;
    protected double valorDiaria;
    protected boolean locado;

    public Veiculo(String placa, String modelo, double valorDiaria, boolean locado) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.locado = locado;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
    public void reajustarDiaria(double percentual) throws IllegalArgumentException{
        if(percentual > 0){
            this.valorDiaria *= 1+(percentual/100);
        } else throw new IllegalArgumentException();
    }

    @Override
    public boolean isLocado() {
        return locado;
    }

    @Override
    public void alugar() throws IllegalStateException {
        if(isLocado()){
            throw new IllegalStateException();
        } else System.out.println("Veículo: " + modelo + " alugado com sucesso!");
    }

    @Override
    public void devolver() throws IllegalStateException {
        if(!isLocado()){
            throw new IllegalStateException();
        } else System.out.println("Veículo: " + modelo + " devolvido com sucesso!");
    }

    public double calcularValorAluguel(int dias){
        if(dias <= 0){
            throw new IllegalArgumentException();
        } else
            return dias * valorDiaria;
    }

    public abstract String getTipo();

    public String toString(){
        return String.format(
                "Tipo: %s | Placa: %s | Modelo: %s | Valor da Diária: %.2f | Locado: %s",
                getTipo(), placa, modelo, valorDiaria, isLocado()
        );
    }
}
