package funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao(){
        return this.salario * 0.10;
    }

    public String toString(){
        return String.format(
                "Funcionário: \n" +
                "Nome: %s\n" +
                        "Salário: %.2f\n" +
                        "Bonificação: %.2f",
                getNome(), getSalario(), getBonificacao()
        );
    }
}
