package exercicioCompleto;

public class Criptomoeda extends AtivoDigital{


    public Criptomoeda(String nome, double valorEmDolar) {
        super(nome, valorEmDolar);
    }

    @Override
    public void transacionar(Double valor) throws TransacaoInvalidaException {
        if(valor < 0){
            throw new TransacaoInvalidaException("Transação inválida: O valor da transação não pode ser negativo.");
        }

        this.valorEmDolar += valor;
        System.out.println("Transação de $" + String.format("%.2f", valor) + " para " + this.nome + " efetuada com sucesso.");
    }
}
