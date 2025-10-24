package exercicioZoologico;

public class Ave extends Animal{
    private String somAve;

    public Ave(String nome, int idade, String somAve){
        super(nome, idade);
        this.somAve = somAve;
    }

    public String falar(String somAve){
        return somAve;
    }

    @Override
    public String toString(){
        return String.format(
                "Ave: \n" +
                "%s\n" +
                        "Som: %s\n",
                infoBasica(), falar(somAve)
        );
    }
}
