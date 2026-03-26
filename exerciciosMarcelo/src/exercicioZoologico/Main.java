package exerciciosMarcelo.src.exercicioZoologico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        Mamifero ma = new Mamifero("a", 19, "Som mamífero");
        Reptil re = new Reptil("b", 20, "Som reptil");
        Ave ave = new Ave("c", 21, "Som ave");

        System.out.println(ma);
        System.out.println(re);
        System.out.println(ave);

        System.out.println("Informe quantos animais quer adicionar: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine();

        Zoologico zoo = new Zoologico(capacidade);
        zoo.adicionarAnimal(scanner, capacidade);
        zoo.listarAnimais();
        scanner.close();
    }
}
