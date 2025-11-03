package exerciciosMarcelo.list.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        while (true){
            System.out.print("Nome: ");
            String entrada = scanner.nextLine();
            if(entrada.equalsIgnoreCase("FIM")) break;
            if(!entrada.isEmpty()){
                nomes.add(entrada);
            }
        }

        for(int i = nomes.size(); i > 0; i--){
            System.out.println(nomes.get(i-1));
        }

//        for(String n : nomes){
//            System.out.println(n + " - ");
//        }

        System.out.println("Informe um nome para ser removido: ");
        String nomeRemover = scanner.nextLine();
        nomes.removeIf(n -> n.equalsIgnoreCase(nomeRemover));
        System.out.println(nomes);

        System.out.println("Informe outro nome para ser inserido: ");
        String inserirNome = scanner.nextLine();
        nomes.add(inserirNome);
        System.out.println(nomes);

        System.out.println("Informe o nome que quer encontrar a posição: ");
        String encontrarPosicaoNome = scanner.nextLine();

        int posicao = nomes.indexOf(encontrarPosicaoNome);
        System.out.println("O índice da posição do nome é: " + posicao);

        System.out.println("Informe outro nome para ser inserido na segunda posição: ");
        String inserirNomeSegundaPosicao = scanner.nextLine();
        nomes.add(1, inserirNomeSegundaPosicao);
        System.out.println(nomes);

        scanner.close();
    }
}
