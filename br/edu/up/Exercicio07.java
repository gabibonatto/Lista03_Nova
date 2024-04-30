package br.edu.up;

import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoConsumidor = calcularCustoConsumidor(custoFabrica);

        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);

        scanner.close();
    }

    private static double calcularCustoConsumidor(double custoFabrica) {
        double impostos = custoFabrica * 0.45; 
        double percentualDistribuidor = 0.28; 
        return custoFabrica + impostos + (custoFabrica + impostos) * percentualDistribuidor;
    }
}
