package exerciciosMarcelo.src.sistemaBancario;

public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros = 0.005;

    public ContaPoupanca(String numero, Cliente titular, double saldo){
        super(numero, titular, saldo);
    }

    @Override
    public boolean sacar(double quantia) {
        if(quantia <= getSaldo()){
            setSaldo(getSaldo() - quantia);
            return true;
        }
        return false;
    }

    public void renderJuros(){
        double juros = getSaldo() * taxaJuros;
        setSaldo(getSaldo() + juros);
    }

    @Override
    public String toString(){
        return String.format(
                "Conta Poupança" +
                        "\nNúmero: %s" +
                        "\nTitular: %s" +
                        "\nSaldo: %.2f",
                getNumero(), getTitular(), getSaldo()
        );
    }
}
