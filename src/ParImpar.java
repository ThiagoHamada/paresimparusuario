import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ou mais números inteiros separados por vírgula:");

        String input = scanner.nextLine();
        String[] numerosString = input.split(",");

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (String numeroString : numerosString) {
            try {
                int numero = Integer.parseInt(numeroString.trim());
                if (numero % 2 == 0) {
                    pares.add(numero);
                } else {
                    impares.add(numero);
                }
            } catch (NumberFormatException e) {
                System.out.println("Atenção: \"" + numeroString + "\" não é um número válido e será ignorado.");
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
