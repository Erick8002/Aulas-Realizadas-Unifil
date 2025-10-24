package provaCorrecao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SuperHeroi sh = new SuperHeroi();
        Lider l = new Lider();
        Endereco e = new Endereco();

        System.out.println("===Cadastro de Super-Herói===");
        System.out.print("Nome: ");
        sh.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        sh.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Super Poder: ");
        sh.setSuperpoder(scanner.nextLine());
        System.out.print("Nível de Poder(1 a 100): ");
        sh.setNivelPoder(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Rua: ");
        e.setRua(scanner.nextLine());
        System.out.print("Cidade: ");
        e.setCidade(scanner.nextLine());
        System.out.print("País: ");
        e.setPais(scanner.nextLine());

        sh.setEndereco(e);

        System.out.println();
        System.out.println(sh);
        System.out.println();

    }
}
