package exerciciosMarcelo.list.gerenciadorJogadoresClube;

public class Jogador {
    private Integer camisa;
    private String nome;
    private double salario;

    public Jogador(Integer camisa, String nome, double salario) {
        this.camisa = camisa;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getCamisa() {
        return camisa;
    }
    public void setCamisa(Integer camisa) {
        this.camisa = camisa;
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

    public double aumentarSalario(double valor){
        return salario+=valor;
    }

    public String toString(){
        return String.format(
                "Número: %s%n" +
                        "Nome: %s%n" +
                        "Salário: %.2f%n",
                getCamisa(), getNome(), getSalario()
        );
    }
}
