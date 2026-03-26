package formasAbstratas.exercicioVeiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo c = new Carro();
        Veiculo b = new Bicicleta();

        System.out.println(c.tipo());
        c.mover();

        System.out.println(b.tipo());
        b.mover();
    }
}
