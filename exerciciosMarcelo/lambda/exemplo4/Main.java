package lambda.exemplo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "C#", "JavaScript", "Portugol");
        List<String> palavrasFiltradas = new ArrayList<>();

        for(String palavra : palavras){
            if(palavra.length() < 5){
                palavrasFiltradas.add(palavra);
            }
        }

        List<String> pf = palavras.stream().filter((str) -> str.length() >= 5).toList();
        System.out.println(pf);
    }
}