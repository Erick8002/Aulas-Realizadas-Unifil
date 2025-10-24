package exerciciosPetri.insertSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos elementos vai ter o vetor: ");
        int qtdNumerosVetor = scanner.nextInt();

        int[] vect = new int[qtdNumerosVetor];

        for(int i = 0; i<vect.length; i++){
            System.out.println("vect[" + i + "]: ");
            vect[i] = scanner.nextInt();
        }

        int aux;
        for(int j = 0; j<vect.length; j++){
            for(int i = 1; i<vect.length; i++){
                if(vect[i] <vect[i-1]){
                    aux = vect[i];
                    vect[i] = vect[i-1];
                    vect[i-1] = aux;
                }
            }
        }

        for(int i = 0; i<vect.length; i++){
            System.out.println("vect[" + i + "]: " + vect[i]);
        }
    }
}

