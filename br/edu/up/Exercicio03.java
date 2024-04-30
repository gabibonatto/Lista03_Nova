package br.edu.up;

import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas efetuadas pelo vendedor (em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        double salarioFinal = calcularSalarioFinal(salarioFixo, totalVendas);

        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo do vendedor: R$" + salarioFixo);
        System.out.println("Salário final do mês: R$" + salarioFinal);

        scanner.close();
    }

    private static double calcularSalarioFinal(double salarioFixo, double totalVendas) {
        double comissao = totalVendas * 0.15;
        return salarioFixo + comissao;
    }
}