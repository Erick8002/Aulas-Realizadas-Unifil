package exerciciosMarcelo.src.empresa;


public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;


    public Funcionario(){ }


    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }


    public Funcionario(String nome, String cpf, String cargo, double salario){
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }


    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }


    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }


    @Override
    public String toString(){
        return String.format(
                "Nome: %s" +
                        "\nCPF: %s" +
                        "\nCargo: %s" +
                        "\nSalário: %.2f\n",
                getNome(), getCpf(), cargo, salario
        );
    }
}
