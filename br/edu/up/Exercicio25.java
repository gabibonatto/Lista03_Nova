package br.edu.up;

import java.util.Scanner;

public class Exercicio25 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de matrícula:");
        int matricula = scanner.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);
        char classificacao = classificarNotaFinal(notaFinal);

        System.out.println("Nome do estudante: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    private static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        // Aplicando os pesos
        double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }

    private static char classificarNotaFinal(double notaFinal) {
        if (notaFinal >= 8) {
            return 'A';
        } else if (notaFinal >= 7) {
            return 'B';
        } else if (notaFinal >= 6) {
            return 'C';
        } else if (notaFinal >= 5) {
            return 'D';
        } else {
            return 'R';
        }
    }
}
