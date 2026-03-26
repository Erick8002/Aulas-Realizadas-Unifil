package exerciciosMarcelo.src.exerciciosFixacaoClassesAbstratas.sistemaControleEntrega;

public class Main {
    public static void main(String[] args) {
        EntregaLocal el = new EntregaLocal("#001");
        EntregaNacional en = new EntregaNacional("#002", 400);

        System.out.println(el.exibirResumo());
        System.out.println(en.exibirResumo());
    }
}
