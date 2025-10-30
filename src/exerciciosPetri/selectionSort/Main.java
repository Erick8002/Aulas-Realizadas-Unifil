package exerciciosPetri.selectionSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos números quer no seu vetor: ");
        int qtd = scanner.nextInt();

        int[] vectNum = new int[qtd];

        for(int i = 0; i< vectNum.length; i++){
            System.out.print("vect[" + i + "]: ");
            vectNum[i] = scanner.nextInt();
        }

//        int numMenor = 0;
//        int temp = 0;
//        for(int j = 0; j<vectNum.length; j++){
//            for(int i = j; i<vectNum.length-1; i++){
//                if(vectNum[i] < vectNum[i+1]){
//                    numMenor = vectNum[i];
//                } else numMenor = vectNum[i+1];
//            }
//            temp = vectNum[j];
//            vectNum[j] = numMenor;
//            vectNum[qtd-1] = temp;
//        }

        int aux;
        for(int i = 0; i<vectNum.length; i++){
            int indiceMenor = i;
            for(int j = i+1; j<vectNum.length; j++){
                if(vectNum[j] < vectNum[indiceMenor]){
                    indiceMenor = j;
                }
            }
            aux = vectNum[i];
            vectNum[i] = vectNum[indiceMenor];
            vectNum[indiceMenor] = aux;
        }

        for(int i = 0; i<vectNum.length; i++){
            System.out.println("vect[" + i + "]" + vectNum[i]);
        }
    }
}
