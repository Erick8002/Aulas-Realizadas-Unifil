package exerciciosMarcelo.formaGeometrica;

import java.util.Locale;

public class AppForma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Quadrado q = new Quadrado("Quadrado", 10);
        Triangulo t = new Triangulo("Triângulo", 10, 5);

        System.out.println(q);
        System.out.println(t);
    }
}
