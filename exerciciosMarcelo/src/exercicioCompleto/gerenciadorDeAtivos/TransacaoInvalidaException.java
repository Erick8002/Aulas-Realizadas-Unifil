package exercicioCompleto.gerenciadorDeAtivos;

public class TransacaoInvalidaException extends Throwable {
        public TransacaoInvalidaException(String mensagem){
            super(mensagem);
        }
}
