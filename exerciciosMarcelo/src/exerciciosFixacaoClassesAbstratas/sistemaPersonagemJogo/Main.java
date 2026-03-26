package exerciciosMarcelo.src.exerciciosFixacaoClassesAbstratas.sistemaPersonagemJogo;

public class Main {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Arthur", 60);
        Mago m = new Mago("Merlin", 70);

        System.out.println(g.exibirStatus());
        System.out.println(m.exibirStatus());
    }
}
