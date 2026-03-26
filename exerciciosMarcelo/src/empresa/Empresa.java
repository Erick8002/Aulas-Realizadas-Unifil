package exerciciosMarcelo.src.empresa;

public class Empresa {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Erick Shinji Fukumoto", "01292157917");
        f1.setCargo("Programador");
        f1.setSalario(3500.0);

        Funcionario f2 = new Funcionario("Yasmin Morila Ribeiro", "12345678900", "Analista", 2300.0);

        Projeto prjt = new Projeto("Sistema de vendas", "20/09/2025", f1);

        System.out.println("Funcionário 1: ");
        System.out.println(f1);

        System.out.println("Funcionário 2: ");
        System.out.println(f2);

        System.out.println("Projeto: ");
        prjt.exibirInformacoes();
    }
}
