package lambda.exemplo3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        valores.forEach((x) -> {
            dobro.add(x*2);
            if(x % 2 == 0){
                par.add(x);
            }else{
                impar.add(x);
            }
        });
        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }
}