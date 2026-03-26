package lambda.exemplo1;

public class Main {
    public interface OperacaoMatematica{
        public int calcular(int a, int b);
    }

    public static void main(String[] args) {
        OperacaoMatematica somar = new OperacaoMatematica() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Soma sem função Lambda: " + somar.calcular(5, 3));
        //**-------------------------------*/
        OperacaoMatematica somarFL = (int a, int b) -> a + b;
        System.out.println("Soma com função Lambda: " + somarFL.calcular(5, 3));

        OperacaoMatematica multiplicarFL = (int a, int b) -> a * b;
        System.out.println("Multiplicação com função Lambda: " + multiplicarFL.calcular(5, 3));
    }
}