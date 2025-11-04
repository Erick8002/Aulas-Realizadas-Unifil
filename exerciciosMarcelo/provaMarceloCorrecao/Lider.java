package provaMarceloCorrecao;

public class Lider extends SuperHeroi{
    private int tempoLideranca;

    public Lider(){ }

    public Lider(String nome, int idade, String superpoder, int nivelPoder, Endereco endereco, int tempoLideranca){
        super(nome, idade, superpoder, nivelPoder, endereco);
        this.tempoLideranca = tempoLideranca;
    }

    public int getTempoLideranca() {
        return tempoLideranca;
    }
    public void setTempoLideranca(int tempoLideranca) {
        this.tempoLideranca = tempoLideranca;
    }

    public String liderar(){
        return getNome() + "está liderando a equipe com sabedoria!";
    }

    public String toString(){
        return String.format(
                "---Dados Líder---" +
                        "\nNome: %s" +
                        "\nIdade: %d" +
                        "\nSuper Poder: %s" +
                        "\nNível de Poder: %d" +
                        "\nEndereço: %s" +
                        "\nTempo de Liderença: %d" +
                        "\n%s",
                getNome(), getIdade(), getSuperpoder(), getNivelPoder(), endereco, getTempoLideranca(), liderar()
        );
    }
}
