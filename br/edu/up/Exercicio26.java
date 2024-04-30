package br.edu.up;

import java.util.Scanner;

public class Exercicio26 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();

        System.out.println("Digite o grupo de risco (1 - Baixo, 2 - Médio, 3 - Alto):");
        int grupoRisco = scanner.nextInt();

        Pretendente pretendente = new Pretendente(nome, idade, grupoRisco);

        System.out.println("Nome do pretendente: " + pretendente.getNome());
        System.out.println("Categoria de seguro: " + pretendente.determinarCategoria());

        scanner.close();
    }
}