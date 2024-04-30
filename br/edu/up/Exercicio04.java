package br.edu.up;

import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolar = scanner.nextDouble();

        double valorReal = converterDolarParaReal(cotacaoDolar, quantidadeDolar);

        System.out.println("O valor em reais é: R$" + valorReal);

        scanner.close();
    }

    private static double converterDolarParaReal(double cotacaoDolar, double quantidadeDolar) {
        return cotacaoDolar * quantidadeDolar;
    }
}
