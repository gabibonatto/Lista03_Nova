package br.edu.up;

import java.util.Scanner;

public class Exercicio15 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Informe o tipo de combustível (álcool, gasolina, diesel) ou 'zero' para encerrar:");
            String tipoCombustivel = scanner.nextLine();

            if (tipoCombustivel.equalsIgnoreCase("zero")) {
                break;
            }

            System.out.println("Informe o valor do veículo:");
            double valorVeiculo = scanner.nextDouble();

            double desconto;
            switch (tipoCombustivel.toLowerCase()) {
                case "álcool":
                    desconto = valorVeiculo * 0.25;
                    break;
                case "gasolina":
                    desconto = valorVeiculo * 0.21;
                    break;
                case "diesel":
                    desconto = valorVeiculo * 0.14;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido.");
                    continue;
            }

            double valorPago = valorVeiculo - desconto;

            totalDesconto += desconto;
            totalPago += valorPago;

            System.out.println("Desconto: " + desconto);
            System.out.println("Valor a ser pago: " + valorPago);
        }

        System.out.println("Total de desconto dado: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);

        scanner.close();
    }
}