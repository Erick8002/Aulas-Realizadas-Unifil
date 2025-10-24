package exerciciosMarcelo.exerciciosFixacaoClassesAbstratas.sistemaPersonagemJogo;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int nivel){
        super(nome, nivel);
    }

    @Override
    public String atacar() {
        return "Ataque Físico: Golpe de Espada!";
    }

    @Override
    public String exibirStatus() {
        return String.format("Guerreiro: %n%s%s%n", super.exibirStatus(), atacar());
    }
}
