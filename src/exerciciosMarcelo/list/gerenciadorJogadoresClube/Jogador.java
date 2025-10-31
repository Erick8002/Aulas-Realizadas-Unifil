package exerciciosMarcelo.list.gerenciadorJogadoresClube;

public class Jogador {
    private int camisa;
    private String nome;
    private double salario;

    public Jogador(int camisa, String nome, double salario) {
        this.camisa = camisa;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCamisa() {
        return camisa;
    }
    public void setCamisa(int camisa) {
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
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
