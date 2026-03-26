package exercicioZoologico;

public class Reptil extends Animal{
    private String somReptil;

    public Reptil(String nome, int idade, String somReptil){
        super(nome, idade);
        this.somReptil = somReptil;
    }

    public String falar(String somReptil){
        return somReptil;
    }

    @Override
    public String toString(){
        return String.format(
                "Reptil: \n" +
                "%s\n" +
                        "Som: %s\n",
                infoBasica(), falar(somReptil)
        );
    }
}
