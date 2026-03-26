package exerciciosInterface.moduloNotificacao;

public class Main {
    public static void main(String[] args) {
        Notificador email = new EmailNotificador();
        Exportavel relatorioCSV = new RelatorioVendas();
        RelatorioService rs1 = new RelatorioService(email, relatorioCSV);
        rs1.gerarEEnviar("eshinfuku@gmail.com");

        System.out.println();

        Notificador sms = new SmsNotificador();
        Exportavel relatorioJson = new RelatorioEstoque();
        RelatorioService rs2 = new RelatorioService(sms, relatorioJson);
        rs2.gerarEEnviar("43 98492-5510");
    }
}