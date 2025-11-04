package formasAbstratas.funcionarioAbstrato;

public class Horista extends FuncionarioAbstrato{
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
