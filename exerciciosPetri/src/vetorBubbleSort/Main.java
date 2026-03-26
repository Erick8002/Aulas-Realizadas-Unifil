package vetorBubbleSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de cada posição do vetor: ");
        int[] vectNum = new int[10];
        int maiorNum = 0;
        int menorNum = 1000000000;

        for(int i = 0; i< vectNum.length; i++){
            vectNum[i] = scanner.nextInt();

            if(vectNum[i] > maiorNum){
                maiorNum = vectNum[i];
            } else if(vectNum[i] < menorNum){
                menorNum = vectNum[i];
            }
        }

        int temp = 0;
        do{
            for(int i = 0; i< vectNum.length-1; i++){
                if(vectNum[i] > vectNum[i + 1]){
                    temp = vectNum[i];
                    vectNum[i] = vectNum[i + 1];
                    vectNum[i + 1] = temp;
                }
            }
        }while(vectNum[0] != menorNum || vectNum[9] != maiorNum);

        for(int i = 0; i<vectNum.length; i++){
            System.out.print(vectNum[i] + " ");
        }

        scanner.close();
    }
}