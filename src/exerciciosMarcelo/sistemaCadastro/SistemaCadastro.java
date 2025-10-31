package exerciciosMarcelo.sistemaCadastro;
import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Departamento d = new Departamento();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        f.setNome(scanner.nextLine());
        System.out.println("Informe a sua matrícula: ");
        f.setMatricula(scanner.nextInt());
        System.out.println("Informe o seu departamento: ");
        d.setCargo(scanner.next());

        f.setDepartamento(d);

        f.exibirInformacao();
    }
}
