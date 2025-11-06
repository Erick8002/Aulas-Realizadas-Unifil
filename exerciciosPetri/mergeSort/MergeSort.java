package mergeSort;

import java.util.Scanner;

public class MergeSort {

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

    public void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, meio, fim);
        }
    }

    public void merge(int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] I = new int[n1];
        int[] F = new int[n2];

        for (int i = 0; i < n1; i++)
            I[i] = this.vetor[inicio + i];
        for (int j = 0; j < n2; j++)
            F[j] = this.vetor[meio + 1 + j];

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (I[i] <= F[j]) {
                this.vetor[k++] = I[i++];
            } else {
                this.vetor[k++] = F[j++];
            }
        }

        while (i < n1) {
            this.vetor[k++] = I[i++];
        }
        while (j < n2) {
            this.vetor[k++] = F[j++];
        }
    }
}
