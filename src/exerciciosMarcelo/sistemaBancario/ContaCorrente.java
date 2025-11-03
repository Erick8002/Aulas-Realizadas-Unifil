package exerciciosMarcelo.sistemaBancario;

public class ContaCorrente extends ContaBancaria{
    private double taxaSaque;
    private double limiteNegativo;

    public ContaCorrente(String numero, Cliente titular){
        super(numero, titular);
        this.taxaSaque = 5.0;
        this.limiteNegativo = -50.0;
    }

    @Override
    public boolean sacar(double quantia) {
        double total = quantia + taxaSaque;
        if(getSaldo() - total >= limiteNegativo){
            setSaldo(getSaldo() - total);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format(
                "Conta Corrente" +
                        "\nNúmero: %s" +
                        "\nTitular: %s" +
                        "\nSaldo: %.2f",
                getNumero(), getTitular(), getSaldo()
        );
    }
}
