package tryCat.exercicioTratarErros;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        try {
            System.out.println("===== Calculadora de Divisão =====");
            System.out.print("Informe o primeiro número: ");
            if(scanner.hasNextDouble()){
                num1 = scanner.nextDouble();
            } else throw new InputMismatchException();

            System.out.print("Informe o segundo número: ");
            if(scanner.hasNextDouble()){
                num2 = scanner.nextDouble();
            } else throw new InputMismatchException();

            if(num2 == 0){
                throw new ArithmeticException("Erro: A divisão por zero não é permitida!");
            }

            double divisao = num1/num2;
            System.out.printf("Resultado da divisão: %.2f", divisao);

        }catch (InputMismatchException e){
            System.err.println("Erro: Entrada inválida! Digite outro número: ");
            scanner.next();
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println("Ocorrou um erro inesperado: " + e.getMessage());
        }finally {
            System.out.println("\nOperação finalizada.");
        }
        scanner.close();
    }
}
