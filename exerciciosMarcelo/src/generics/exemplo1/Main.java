package exerciciosMarcelo.src.generics.exemplo1;

public class Main {
    public static void main(String[] args) {
        Generico g = new Generico();
        g.addItem("Caneta");
        System.out.println(g.getItem());

        Genericos<String> a = new Genericos<>();
        a.addItem("Caneta");
        System.out.println(a.getItem());

        Genericos<Integer> b = new Genericos<>();
        b.addItem(110);
        System.out.println(b.getItem());

        Genericos<Boolean> c = new Genericos<>();
        c.addItem(true);
        System.out.println(c.getItem());
    }
}
