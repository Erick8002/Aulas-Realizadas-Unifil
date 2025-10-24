package exerciciosMarcelo.formasAbstratas.exercicioBanco2;

public class Main {
    public static void main(String[] args) {
        Conta c;
        c = new ContaCorrente2();
        c.mostrarValor();
        System.out.println(c.getTaxa());

        c = new ContaPoupanca2();

        c.mostrarValor();
        System.out.println(c.getTaxa());
    }
}
