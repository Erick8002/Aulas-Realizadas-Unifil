package exerciciosMarcelo.funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario g = new Gerente("Erick", 5000.0, "123456");
        Funcionario f = new Funcionario("Carlos", 2500.0);
        Funcionario s = new Secretaria("Alef", 1500.0);

        System.out.println(g);
        System.out.println();
        System.out.println(f);
        System.out.println();
        System.out.println(s);
    }
}





















