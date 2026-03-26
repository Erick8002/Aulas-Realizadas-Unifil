package exerciciosMarcelo.src.list.gerenciadorJogadoresClube;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de jogadores que serão cadastrados: ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        List<Jogador> jogadores = new ArrayList<>();

        for(int i = 0; i<qtd; i++){
            Integer numero;
            while(true){
                System.out.print("Informe o número da camiseta do jogador: ");
                numero = scanner.nextInt();
                scanner.nextLine();
                boolean jaExiste = false;

                for(Jogador j : jogadores){
                    if(j.getCamisa() == numero){
                        jaExiste = true;
                        System.out.println("O número ja está sendo usado, informe outro.");
                        break;
                    }
                }
                if(!jaExiste) break;
            }
            System.out.print("Informe o nome do jogador: ");
            String nome = scanner.nextLine();
            System.out.print("Informe o salário mensal do jogador: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            jogadores.add(new Jogador(numero, nome, salario));
        }

        System.out.println("Informe o número de um jogador para ter um acréscimo no salário: ");
        int numero = scanner.nextInt();
        boolean numEncotrado = false;
        for(Jogador j : jogadores){
            if(j.getCamisa() == numero){
                System.out.println("Número encontrado.");
                System.out.println("Informe a porcentagem do acréscimo: ");
                double porcentagemAcrescimo = scanner.nextDouble();
                j.aumentarSalario((porcentagemAcrescimo/100)*j.getSalario());
                numEncotrado = true;
                break;
            }
        }
        if(!numEncotrado){
            System.out.println("Número não encontrado. Acréscimo cancelado!");
        }

        int numeroMostrar = 1;
        System.out.println("\nLista dos jogadores: ");
        for(Jogador j : jogadores){
            System.out.println("Jogador " + numeroMostrar);
            System.out.println(j);
            numeroMostrar++;
        }

        scanner.close();
    }
}
