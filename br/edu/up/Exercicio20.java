package br.edu.up;

import java.util.Scanner;

public class Exercicio20 {
    private static final double SALARIO_NIVEL_1 = 12.00;
    private static final double SALARIO_NIVEL_2 = 17.00;
    private static final double SALARIO_NIVEL_3 = 25.00;

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        double salario = calcularSalario(nivel);
        System.out.println("O salário do professor é: R$" + salario);

        scanner.close();
    }

    private static double calcularSalario(int nivel) {
        double salario = 0;
        switch (nivel) {
            case 1:
                salario = SALARIO_NIVEL_1;
                break;
            case 2:
                salario = SALARIO_NIVEL_2;
                break;
            case 3:
                salario = SALARIO_NIVEL_3;
                break;
            default:
                System.out.println("Nível inválido.");
                break;
        }
        return salario;
    }
}
