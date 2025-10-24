package exerciciosMarcelo.formasAbstratas.formaGeometricaAbstrata;

public class AppForma {
    public static void main(String[] args) {
        Quadrado q = new Quadrado("Quadrado", 10);
        Triangulo t = new Triangulo("Triângulo", 10, 5);
        Circulo c = new Circulo("Círculo", 10);

        System.out.println(q);
        System.out.println();
        System.out.println(t);
        System.out.println();
        System.out.println(c);
    }
}
