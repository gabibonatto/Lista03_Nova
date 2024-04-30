package br.edu.up;

import java.util.Scanner;

public class Exercicio23 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a altura da pessoa em metros:");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        CalculadoraPesoIdeal calculadora = new CalculadoraPesoIdeal(nome, sexo, altura, idade);
        double pesoIdeal = calculadora.calcularPesoIdeal();

        if (pesoIdeal != 0) {
            System.out.println("Nome: " + calculadora.getNome());
            System.out.println("Peso ideal: " + pesoIdeal + " kg");
        } else {
            System.out.println("Dados inválidos para calcular o peso ideal.");
        }

        scanner.close();
    }
}
