package br.edu.up;

import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int numeroPessoas = scanner.nextInt();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }

        scanner.close();
    }
}
