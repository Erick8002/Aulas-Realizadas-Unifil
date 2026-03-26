package formasAbstratas.funcionarioAbstrato;

public class Mensalista extends FuncionarioAbstrato{
    private double salarioMensal;

    public Mensalista(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
