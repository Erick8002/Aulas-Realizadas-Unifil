package exerciciosMarcelo.src.list.vetor5Nomes;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        String[] vectNome = new String[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<vectNome.length; i++){
            System.out.print("Informe o " + (i + 1) + " nome: ");
            vectNome[i] = scanner.nextLine().trim();
        }

        for(int i = vectNome.length-1; i >= 0; i--){
            System.out.println("Nome: " + vectNome[i]);
        }

        scanner.close();
    }
}
