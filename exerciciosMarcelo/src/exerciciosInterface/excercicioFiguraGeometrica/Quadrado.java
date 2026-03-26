package exerciciosInterface.excercicioFiguraGeometrica;

public class Quadrado implements FiguraG{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
