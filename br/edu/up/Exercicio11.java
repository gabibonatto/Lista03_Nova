package br.edu.up;

import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 56; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.next();

            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.next().charAt(0);

            if (sexo == 'M' || sexo == 'm') {
                System.out.println(nome + " é homem");
                totalHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println(nome + " é mulher");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido, por favor insira M para masculino ou F para feminino.");
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        scanner.close();
    }
}
