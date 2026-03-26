package exerciciosMarcelo.src.generics.exemplo2;

public class App {
    public static void main(String[] args) {
        Repositorio<Produto> repositorio = new Repositorio<>();

        repositorio.adicionar(new Produto(101, "Mouse", 399.00));
        repositorio.adicionar(new Produto(102, "Teclado", 120.00));
        repositorio.adicionar(new Produto(103, "Monitor", 300.00));
        repositorio.adicionar(new Produto(104, "Pendrive", 50.00));

        repositorio.listarProdutos();
        System.out.println("");

        System.out.println("Busca pelo código: " + 102);
        Produto busca = repositorio.buscarPorCodigo(102);
        if(busca != null){
            System.out.println("Produto encontrado com sucesso!");
            System.out.println("Produto: \n" + busca);
        } else System.out.println("Produto não encontrado!");

        System.out.println("\nBusca pelo maior preço: ");
        Produto buscaMaiorPreco = repositorio.buscarMaiorPreco();
        System.out.println("Produto mais caro: \n" + buscaMaiorPreco);

        System.out.println("\nBusca pelo menor preço: ");
        Produto buscaMenorPreco = repositorio.buscarMenorPreco();
        System.out.println("Produto mais barato: \n" + buscaMenorPreco);
    }
}
