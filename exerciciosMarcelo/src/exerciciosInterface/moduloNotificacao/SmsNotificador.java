package exerciciosInterface.moduloNotificacao;

public class SmsNotificador implements Notificador{
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.printf("=== SMS ===\n" +
                "Destino: %s%n" +
                "Mensagem: %s",
                destino, mensagem);
    }
}