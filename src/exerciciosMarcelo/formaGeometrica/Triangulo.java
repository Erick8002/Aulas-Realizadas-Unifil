package exerciciosMarcelo.formaGeometrica;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea(){
        return (base *  altura)/2;
    }

    public String toString(){
        return String.format(
                "Forma Geométrica: %s\n" +
                        "Base: %.2f%n" +
                        "Altura: %.2f%n" +
                        "Área: %.2f%n",
                getNome(), getBase(), getAltura(), calcularArea()
        );
    }
}
