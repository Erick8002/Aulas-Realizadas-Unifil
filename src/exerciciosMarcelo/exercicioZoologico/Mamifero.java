package exerciciosMarcelo.exercicioZoologico;

public class Mamifero extends Animal{
    private String somMamifero;

    public Mamifero(String nome, int idade, String somMamifero){
        super(nome, idade);
        this.somMamifero = somMamifero;
    }

    public String falar(String somMamifero){
        return somMamifero;
    }

    @Override
    public String toString(){
        return String.format(
                "Mamífero: \n" +
                "%s\n" +
                        "Som: %s\n",
                infoBasica(), falar(somMamifero)
        );
    }
}
