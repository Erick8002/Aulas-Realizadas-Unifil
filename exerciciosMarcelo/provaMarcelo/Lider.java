package provaMarcelo;

public class Lider extends SuperHeroi{
    private int tempoLideranca;

    public Lider(){}

    public Lider(String nome, int idade, String superpoder, int nivelDePoder, int tempoLideranca, Endereco endereco){
        super(nome, idade, superpoder, nivelDePoder, endereco);
        this.tempoLideranca = tempoLideranca;
    }

    public int getTempoLideranca() {
        return tempoLideranca;
    }
    public void setTempoLideranca(int tempoLideranca) {
        this.tempoLideranca = tempoLideranca;
    }

    public String liderar(){
        return getNome() + " está liderando equipe com sabedoria!";
    }

    @Override
    public String toString(){
        return String.format(
                "---Dados do Líder---" +
                        "\nNome: %s" +
                        "\nIdade: %d" +
                        "\nSuper Poder: %s" +
                        "\nNível de Poder: %d" +
                        "\nEndereço: %s" +
                        "\nTempo de liderança: %s anos" +
                        "\n%s",
                getNome(), getIdade(),getSuperpoder(),getNivelDePoder(), endereco, getTempoLideranca(), liderar()
        );
    }
}
