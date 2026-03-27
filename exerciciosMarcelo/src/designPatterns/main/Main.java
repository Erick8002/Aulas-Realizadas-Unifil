package designPatterns.main;

import designPatterns.factory.*;
import designPatterns.strategy.*;

public class Main { 
    public static void main(String[] args) {
        Pagamento p = PagamentoFactory.criarPagamento("Pix");

        p.pagar(100);
    }
}
