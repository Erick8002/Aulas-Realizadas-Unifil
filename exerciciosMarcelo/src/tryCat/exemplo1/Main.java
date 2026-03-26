package tryCat.exemplo1;

public class Main {
    public static void main(String[] args) {
        String texto = "10";
        try {
            int valor = Integer.parseInt(texto);
            System.out.println(valor);
        } catch (NumberFormatException e){
            System.out.println(e);
        } finally {
            System.out.println("Tentativa de conversão");
        }
    }
}
