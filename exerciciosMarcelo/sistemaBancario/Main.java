package sistemaBancario;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Erick", "012.921.579-17");
        Cliente cliente2 = new Cliente("Alexandre", "123.456.789-00");

        ContaCorrente cc = new ContaCorrente("00001", cliente1);
        ContaPoupanca cp = new ContaPoupanca("00002", cliente2, 1000.0);

        System.out.println("Operações na Conta Corrente");
        cc.depositar(500);
        if(cc.sacar(100.0)){
            System.out.println("Saque realizado!");
        } else System.out.println("Saque negado!");
        System.out.println();

        System.out.println("Operações na Conta Poupança");
        cp.depositar(200.0);
        System.out.println("Aplicando Rendimento na Conta Poupança");
        cp.renderJuros();
        System.out.println();

        System.out.println("Comprovante da Conta Corrente");
        cc.imprimirComprovante();
        System.out.println();

        System.out.println("Comprovante da Conta Poupança");
        cp.imprimirComprovante();
    }
}
