package exerciciosMarcelo.exerciciosFixacaoClassesAbstratas.sistemaPersonagemJogo;

public abstract class Personagem {
    private String nome;
    private int nivel;

    public Personagem(String nome, int nivel){
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome(){
        return nome;
    }

    public int getNivel(){
        return nivel;
    }

    public abstract String atacar();

    public String exibirStatus(){
        return String.format(
                "Nome: %s%n" +
                        "Nível: %d%n",
                getNome(), getNivel()
        );
    }
}
