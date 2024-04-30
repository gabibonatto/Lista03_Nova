package br.edu.up;

import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = calcularValorPrestacao(valorCompra);

        System.out.println("O valor de cada prestação é: R$" + valorPrestacao);

        scanner.close();
    }

    private static double calcularValorPrestacao(double valorCompra) {
        return valorCompra / 5; 
    }
}
