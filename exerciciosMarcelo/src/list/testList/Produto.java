package exerciciosMarcelo.src.list.testList;

public class Produto {
    private String produto;
    private double preco;
    private int qtd;

    public Produto(String produto, double preco, int qtd) {
        this.produto = produto;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String toString(){
        return String.format(
                "Nome: %s%n" +
                        "Preço: %.2f%n" +
                        "Quantidade: %d%n",
                getProduto(), getPreco(), getQtd(), getQtd()
        );
    }
}
