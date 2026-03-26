package exerciciosMarcelo.src.exercicioCompleto.processamentosDePedidosOnline;

public interface Transacionavel<T> {
    void transacionar(T valor) throws TransacaoInvalidaException;
        T getValorAtual();
}
