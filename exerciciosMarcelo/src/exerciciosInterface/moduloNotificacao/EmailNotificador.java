package exerciciosMarcelo.src.exerciciosInterface.moduloNotificacao;

public class EmailNotificador implements  Notificador{
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.printf("=== Email ===\n" +
                        "Destino: %s%n" +
                        "Mensagem: %s%n",
                destino, mensagem);
    }
}
