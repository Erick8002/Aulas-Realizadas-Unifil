package exerciciosMarcelo.src.exerciciosInterface.pagamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Pagamento {
    void pagar(double valor);
    default String recibo(double valor){
        if(valor <= 0)throw new IllegalArgumentException("Valor deve ser positivo");
        String meio = getClass().getSimpleName();
        double taxa = taxaAplicada();
        if(taxa < 0 || taxa > 1) throw new IllegalArgumentException("Taxa deve estar entre 0 e 1");
        double total = valor + valor * taxa;
        String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        return ("== Recibo ==\n" +
                "Meio: " + meio +
                "\nData: " + data +
                "\nValor: R$" + String.format("%.2f", valor) +
                "\nTaxa: " + String.format("%.1f", taxa * 100) + "%" +
                "\nTotal: " + String.format("%.2f", total));
    }

    default double taxaAplicada(){
        return 0.0;
    }
}
