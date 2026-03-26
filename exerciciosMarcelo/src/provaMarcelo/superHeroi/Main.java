package exerciciosMarcelo.src.provaMarcelo.superHeroi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SuperHeroi sh = new SuperHeroi();
        Endereco e = new Endereco();
        Lider l = new Lider();

        System.out.println("===Cadastro de Super-Herói===");
        System.out.print("Nome: ");
        sh.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        sh.setIdade(scanner.nextInt());
        System.out.print("Super Poder: ");
        sh.setSuperpoder(scanner.next());
        System.out.print("Nível de Poder(1 a 100): ");
        sh.setNivelDePoder(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Rua: ");
        e.setRua(scanner.nextLine());
        System.out.print("Cidade: ");
        e.setCidade(scanner.next());
        System.out.print("País: ");
        e.setPais(scanner.next());
        scanner.nextLine();

        sh.setEndereco(e);

        System.out.println();
        System.out.println(sh);
        System.out.println();

        System.out.println("===Cadastro do Líder da Liga===");
        System.out.print("Nome: ");
        l.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        l.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Super Poder: ");
        l.setSuperpoder(scanner.nextLine());
        System.out.print("Nível de Poder(1 a 100): ");
        l.setNivelDePoder(scanner.nextInt());
        System.out.print("Tempo de liderança(anos): ");
        l.setTempoLideranca(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Rua: ");
        e.setRua(scanner.nextLine());
        System.out.print("Cidade: ");
        e.setCidade(scanner.nextLine());
        System.out.print("País: ");
        e.setPais(scanner.nextLine());

        l.setEndereco(e);

        System.out.println();
        System.out.println(l);

        scanner.close();
    }
}
