package exerciciosMarcelo.src.empresa;

public class Projeto {
    private String nomeProjeto;
    private String prazoEntrega;
    private Funcionario funcionarioResponsavel;

    public Projeto(){ }

    public Projeto(String nomeProjeto, String prazoEntrega, Funcionario funcionarioResponsavel){
        this.nomeProjeto = nomeProjeto;
        this.prazoEntrega = prazoEntrega;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public void exibirInformacoes(){
        System.out.printf(
                "Nome do Projeto: %s" +
                        "\nPrazo de Entrega: %s" +
                        "\nFuncionário Responsável: %s",
                nomeProjeto, prazoEntrega, funcionarioResponsavel.getNome());
    }
}
