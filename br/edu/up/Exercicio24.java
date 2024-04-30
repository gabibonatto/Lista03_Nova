package br.edu.up;

import java.util.Scanner;

public class Exercicio24 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);
        System.out.println("A nota final do estudante é: " + notaFinal);

        scanner.close();
    }

    private static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        // Aplicando os pesos
        double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }
}
