package tryCat.exemplo1;

public class Main3 {
    public static void main(String[] args) {
        double preco = -1;
        try {
            if (preco < 0) {
                System.out.println("Valor não pode ser negativo");
                throw new IllegalArgumentException("Sistema PAROU!");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Fim do programa!");
        }
    }
}
