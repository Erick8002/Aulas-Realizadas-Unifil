package exerciciosMarcelo.src.exercicioCompleto.processamentosDePedidosOnline;

public abstract class Produto implements Transacionavel<Double>{
    protected int id;
    protected String nome;
    protected double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public Double getValorAtual(){
        return this.preco;
    }

    @Override
    public void transacionar(Double quantidade) throws TransacaoInvalidaException {
        if(quantidade <= 0){
            throw new TransacaoInvalidaException("Erro no Reabastecimento: A quantidade deve ser positiva.");
        }
        System.out.println("Reabastecendo " + nome + ", quantidade: " + quantidade);
        System.out.println("Valor do reabastecimento: R$10.00");
        this.preco += 10.00;
    }

    public String getNome(){
        return nome;
    }

    public abstract double calcularValorTotal();
}
