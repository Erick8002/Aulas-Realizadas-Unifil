package exerciciosMarcelo.provaMarceloCorrecao;

public class SuperHeroi {
    private String nome;
    private int idade;
    private String superpoder;
    private int nivelPoder;
    Endereco endereco;

    public SuperHeroi() {}

    public SuperHeroi(String nome, int idade, String superpoder, int nivelPoder, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.superpoder = superpoder;
        this.nivelPoder = nivelPoder;
        this.endereco = endereco;
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

    public String getSuperpoder() {
        return superpoder;
    }
    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }
    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return String.format(
                "---Dados dp Super-Herói---" +
                        "\nNome: %s" +
                        "\nIdade: %d" +
                        "\nSuper Poder: %s" +
                        "\nNível de Poder: %d" +
                        "\nEndereço: %s",
                getNome(), getIdade(), getSuperpoder(), getNivelPoder(), endereco
        );
    }
}
