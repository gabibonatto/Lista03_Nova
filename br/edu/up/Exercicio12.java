package br.edu.up;

import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite o ano do carro: ");
            int ano = scanner.nextInt();

            System.out.print("Digite o valor do carro: ");
            double valor = scanner.nextDouble();

            Carro carro = new Carro(ano, valor);

            double desconto = calcularDesconto(carro);
            double valorComDesconto = calcularValorComDesconto(carro, desconto);

            System.out.println("O valor do desconto é: " + (desconto * 100) + "%");
            System.out.println("O valor a ser pago pelo cliente é: R$" + valorComDesconto);

            totalGeral++;

            if (carro.getAno() <= 2000) {
                totalCarrosAte2000++;
            }

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close();
    }

    private static double calcularDesconto(Carro carro) {
        return (carro.getAno() <= 2000) ? 0.12 : 0.07;
    }

    private static double calcularValorComDesconto(Carro carro, double desconto) {
        return carro.getValor() * (1 - desconto);
    }
}
