package quickSort;

import java.util.Scanner;

public class QuickSort {
    Integer vetor [] = new Integer[5];
    int aux;

    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = ");
            this.vetor[i] = scanner.nextInt();
        }
    }

    public void exibirVetor() {
        System.out.println("Exibindo vetor: ");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("Vetor[" + i + "] = " + this.vetor[i]);
        }
    }

    public void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int pi = particao(inicio, fim);
            quickSort(inicio, pi - 1);
            quickSort(pi + 1, fim);
        }
    }

    public int particao(int inicio, int fim) {
        int pivo = this.vetor[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (this.vetor[j] < pivo) {
                i++;
                int aux = this.vetor[i];
                this.vetor[i] = this.vetor[j];
                this.vetor[j] = aux;
            }
        }
        int aux = this.vetor[i + 1];
        this.vetor[i + 1] = this.vetor[fim];
        this.vetor[fim] = aux;
        return i + 1;
    }
}
