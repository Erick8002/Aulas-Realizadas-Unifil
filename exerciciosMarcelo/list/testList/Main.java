package list.testList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        Produto p1 = new Produto("Mouse", 300.0, 5);
        lista.add(p1);
        Produto p2 = new Produto("Teclado", 350.0, 3);
        lista.add(p2);
        Produto p3 = new Produto("Fone", 250.0, 4);
        lista.add(p3);

        //Lista com forEach
        for(Produto p : lista){
            System.out.println(p);
        }

        //Lista com Lambda
        lista.forEach(System.out::println);
    }
}