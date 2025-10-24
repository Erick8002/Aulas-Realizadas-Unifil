package exerciciosMarcelo.formasAbstratas.funcionarioAbstrato;

public abstract class FuncionarioAbstrato {
    private String nome;

    public FuncionarioAbstrato(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
