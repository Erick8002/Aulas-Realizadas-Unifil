package exerciciosMarcelo.exerciciosFixacaoClassesAbstratas.sistemaPersonagemJogo;

public class Mago extends Personagem{
    public Mago(String nome, int nivel){
        super(nome, nivel);
    }

    @Override
    public String atacar() {
        return "Ataque Mágico: Lança Feitiço!";
    }

    @Override
    public String exibirStatus() {
        return String.format("Mago: %n%s%s%n", super.exibirStatus(), atacar());
    }
}
