package exerciciosMarcelo.src.exercicioZoologico;

public class Animal {
    private String nome;
    private int idade;
    private String somAnimalZoologico;

    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Animal(String nome, int idade, String somAnimalZoologico){
        this.nome = nome;
        this.idade = idade;
        this.somAnimalZoologico = somAnimalZoologico;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String falar(){
        return "Animal falando!!";
    }

    public String falar(String som){
        return som;
    }

    protected String infoBasica(){
        return String.format(
                "Nome: %s\n" +
                        "Idade: %d",
                getNome(), getIdade()
        );
    }

    protected String infoBasicaZoologico(){
        return String.format(
                "Nome: %s\n" +
                        "Idade: %d\n" +
                        "Som do animal: %s\n",
                getNome(), getIdade(), falar(somAnimalZoologico)
        );
    }

    @Override
    public String toString(){
        return String.format(
                "%s",
                infoBasica()
        );
    }
}
