package lambda.exemplo2;

interface ManipularString{
    String manipular(String str);
}

public class Main {
    public static void main(String[] args) {
        ManipularString maiuscula = new ManipularString() {
            @Override
            public String manipular(String str) {
                return "Unifilista";
            }
        };
        System.out.println(maiuscula.manipular("Unifilista"));

        ManipularString maiusculaFL = (str) -> str.toUpperCase();
        System.out.println(maiusculaFL.manipular("Unifilista"));
    }
}
