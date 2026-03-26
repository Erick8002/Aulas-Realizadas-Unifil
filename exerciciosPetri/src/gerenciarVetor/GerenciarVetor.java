package gerenciarVetor;

import java.util.Scanner;

public class GerenciarVetor {
    Integer vetor [] = new Integer[5]; //[null, null]


    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = ");
            this.vetor[i] = scanner.nextInt();
        }
    }

    public void ordenarCrescente() {
        int aux;
        boolean trocas;
        for (int j = 1; j < this.vetor.length; j++) {
            trocas = false;
            for (int i = 0; i < this.vetor.length-j; i++) {
                if(this.vetor[i] > this.vetor[i+1]) {
                    aux = this.vetor[i];
                    this.vetor[i] = this.vetor[i+1];
                    this.vetor[i+1] = aux;
                    trocas = true;
                }
            }
            if(!trocas) {
                break;
            }
        }

    }

    public void exibirVetor() {
        System.out.println("Exibindo vetor: ");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("Vetor[" + i + "] = " + this.vetor[i]);
        }
    }

}
