package br.edu.up;

import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int numeroPessoas = scanner.nextInt();
        scanner.nextLine(); 

        int totalAptas = 0;
        int totalInaptas = 0;

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); 

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Saúde (A/S): ");
            char saude = scanner.next().charAt(0);
            scanner.nextLine(); 

            Pessoa pessoa = new Pessoa(nome, sexo, idade, saude);

            if ((pessoa.getIdade() >= 18 && pessoa.getSexo() == 'M' && pessoa.getSaude() == 'A') || (pessoa.getIdade() >= 18 && pessoa.getSexo() == 'F')) {
                System.out.println(pessoa.getNome() + " está apto(a) para o serviço militar obrigatório.");
                totalAptas++;
            } else {
                System.out.println(pessoa.getNome() + " não está apto(a) para o serviço militar obrigatório.");
                totalInaptas++;
            }
        }

        System.out.println("Total de pessoas aptas: " + totalAptas);
        System.out.println("Total de pessoas inaptas: " + totalInaptas);

        scanner.close();
    }
}
