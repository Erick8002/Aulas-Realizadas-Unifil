package exerciciosMarcelo.sistemaBancario;

public class ContaBancaria {
    private final String numero;
    private Cliente titular;
    private double saldo;

    public ContaBancaria(String numero, Cliente titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria(String numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumero(){
        return numero;
    }

    public Cliente getTitular(){
        return titular;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

    public void depositar(double quantia){
        if(quantia <= 0){
            System.out.println("Valor de depósito inválido, o valor deve ser positivo!");
            return;
        }
        saldo += quantia;
    }

    public boolean sacar(double quantia){
        if(quantia <= 0 || quantia > saldo){
            System.out.println("Valor de saque inválido, o valor deve ser menor ou igual do que a quantia que você possui na conta!");
            return false;
        }
        saldo -= quantia;
        return true;
    }

    public final void imprimirComprovante(){
        System.out.println("===== Comprovante =====");
        System.out.println("Número: " + getNumero());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("=======================");
    }

    public String toString(){
        return String.format(
                "Conta Bancária" +
                        "\nNúmero da conta: %s" +
                        "\nTitular: %s" +
                        "\nSaldo: %.2f",
                getNumero(), getTitular(), getSaldo()
        );
    }
}
