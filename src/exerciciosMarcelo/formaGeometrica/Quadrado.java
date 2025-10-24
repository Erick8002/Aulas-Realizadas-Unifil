package exerciciosMarcelo.formaGeometrica;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(String nome, double lado){
        super(nome);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public String toString(){
        return String.format(
                "Forma Geométrica: %s\n" +
                        "Lado: %.2f%n" +
                        "Área: %.2f%n",
                getNome(), getLado(), calcularArea()
        );
    }
}
