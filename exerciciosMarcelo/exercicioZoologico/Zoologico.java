package exercicioZoologico;

import java.util.Scanner;

public class Zoologico {
    Animal animal;
    Animal[] vectAnimal;
    int contador;

    public Zoologico(int capacidade){
        vectAnimal = new Animal[capacidade];
        contador = 0;
    }

    public void adicionarAnimal(Scanner scanner, int capacidade){
        for(int i = 0; i<capacidade; i++){
            if(contador < vectAnimal.length){
                System.out.println("Informe o Animal que quer adicionar: ");
                String nome = scanner.nextLine();
                System.out.println("Informe a idade do animal: ");
                int idade = scanner.nextInt();
                System.out.println("Informe o som do animal: ");
                scanner.nextLine();
                String som = scanner.nextLine();

                vectAnimal[contador] = new Animal(nome, idade, som);
                contador++;
            }
            else{
                System.out.println("O zoológico está cheio, não é possível adicionar!!");
            }
        }
    }

    public void listarAnimais(){
        for(int i = 0; i<contador; i++){
            System.out.println("Animal " + (i + 1));
            System.out.println(vectAnimal[i].infoBasicaZoologico() + "\n");
        }
    }

}
