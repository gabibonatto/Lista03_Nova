package br.edu.up;

import java.util.Scanner;

public class Exercicio16 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int totalFuncionarios = 584;
        double[] salarios = new double[totalFuncionarios];
        double salarioMinimo = 1100;

        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.println("Informe o salário do funcionário " + (i + 1) + ":");
            salarios[i] = scanner.nextDouble();
        }

        for (int i = 0; i < totalFuncionarios; i++) {
            double reajuste = 0;

            if (salarios[i] < 3 * salarioMinimo) {
                reajuste = salarios[i] * 0.5;
            } else if (salarios[i] >= 3 * salarioMinimo && salarios[i] <= 10 * salarioMinimo) {
                reajuste = salarios[i] * 0.2;
            } else if (salarios[i] > 10 * salarioMinimo && salarios[i] <= 20 * salarioMinimo) {
                reajuste = salarios[i] * 0.15;
            } else {
                reajuste = salarios[i] * 0.1;
            }

            System.out.println("Funcionário " + (i + 1) + ": Reajuste de " + reajuste);
        }

        scanner.close();
    }
}
