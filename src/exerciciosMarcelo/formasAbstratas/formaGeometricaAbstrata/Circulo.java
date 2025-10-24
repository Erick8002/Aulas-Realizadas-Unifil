package exerciciosMarcelo.formasAbstratas.formaGeometricaAbstrata;

public class Circulo extends FormaGeometrica{
    private final double pi = 3.14;
    private double raio;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (pi * (raio * raio));
    }
}
