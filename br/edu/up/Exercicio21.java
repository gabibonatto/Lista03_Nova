package br.edu.up;

import java.util.Scanner;

public class Exercicio21 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do nadador:");
        int idade = scanner.nextInt();

        String categoria = classificarNadador(idade);
        System.out.println("O nadador está na categoria: " + categoria);

        scanner.close();
    }

    private static String classificarNadador(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            return "Sênior";
        } else {
            return "Idade fora da faixa etária";
        }
    }
}