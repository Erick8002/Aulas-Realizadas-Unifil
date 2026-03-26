package exerciciosMarcelo.src.exercicioCompleto.processamentosDePedidosOnline;

public class TransacaoInvalidaException extends Exception{
    public TransacaoInvalidaException(String mensagem){
        super(mensagem);
    }
}
