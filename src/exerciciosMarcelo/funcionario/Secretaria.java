package exerciciosMarcelo.funcionario;

public class Secretaria extends Funcionario{
    public Secretaria(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;
    }

    public String toString(){
        return String.format(
                "Secretário: \n" +
                "Nome: %s\n" +
                        "Salário: %.2f\n" +
                        "Bonificação: %.2f",
                getNome(), getSalario(), getBonificacao()
        );
    }
}
