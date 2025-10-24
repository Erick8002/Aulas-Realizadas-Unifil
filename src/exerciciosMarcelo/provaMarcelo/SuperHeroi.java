package prova;

public class SuperHeroi {
    private String nome;
    private int idade;
    private String superpoder;
    private int nivelDePoder;
    Endereco endereco;

    public SuperHeroi(){}

    public SuperHeroi(String nome, int idade, String superpoder, int nivelDePoder, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.superpoder = superpoder;
        this.nivelDePoder = nivelDePoder;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }
    public void setNivelDePoder(int nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }
    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return String.format(
                "---Dados do Super-Herói---" +
                        "\nNome: %s" +
                        "\nIdade: %d" +
                        "\nSuper Poder: %s" +
                        "\nNível de Força: %s" +
                        "\nEndereço: %s",
                getNome(), getIdade(), getSuperpoder(), getNivelDePoder(), endereco
        );
    }
}