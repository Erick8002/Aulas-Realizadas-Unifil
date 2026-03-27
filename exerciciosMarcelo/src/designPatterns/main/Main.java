package designPatterns.main;

import designPatterns.factory.*;
import designPatterns.strategy.*;
import designPatterns.singleton.*;

public class Main { 
    public static void main(String[] args) {

        Pagamento p = PagamentoFactory.criarPagamento("Pix");

        p.pagar(100);
        
        //Utilizando Singleton.
        Configuracao c1 = Configuracao.getInstancia();
        Configuracao c2 = Configuracao.getInstancia();
        String mensagem;

        if(c1 == c2){
            mensagem = "Configurações iguais!";
            c1.mostrarMensagem(mensagem);
        } else {
            mensagem = "Configurações diferentes!";
            c1.mostrarMensagem(mensagem);
        }


    }
}
