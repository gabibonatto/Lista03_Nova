package br.edu.up;

import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média do aluno: " + media);
        System.out.println("Menção: " + calcularMencao(media));

        scanner.close();
    }

    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    private static String calcularMencao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media <= 5) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }
}
