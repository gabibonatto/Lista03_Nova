package br.edu.up;

import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int contador = contarNumerosNoIntervalo(scanner);

        System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);

        scanner.close();
    }

    private static int contarNumerosNoIntervalo(Scanner scanner) {
        int contador = 0;

        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        return contador;
    }
}

