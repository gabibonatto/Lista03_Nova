package br.edu.up;

import java.util.Scanner;

public class Exercicio17 {
    private String nomeFuncionario;
    private double salarioFuncionario;
    private double salarioMinimo;

    public Exercicio17(String nomeFuncionario, double salarioFuncionario, double salarioMinimo) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularNovoSalario() {

        if (salarioFuncionario <= 0 || salarioMinimo <= 0) {
            throw new IllegalArgumentException("Os valores do salário e do salário mínimo devem ser positivos.");
        }

        return salarioFuncionario + (salarioFuncionario * 0.1);
    }

    public double calcularAumentoFolha() {
        double aumentoFolha = calcularNovoSalario() - salarioFuncionario;
        return aumentoFolha;
    }

    public void exibirInformacoes() {
        double novoSalario = calcularNovoSalario();
        double aumentoFolha = calcularAumentoFolha();

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: " + aumentoFolha);
        System.out.println("Novo salário: " + novoSalario);
        System.out.println("Aumento na folha de pagamento: " + aumentoFolha);
    }

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Informe o salário do funcionário:");
        double salarioFuncionario = scanner.nextDouble();
        if (salarioFuncionario <= 0) {
            System.out.println("O salário deve ser um valor positivo. Tente novamente.");
            scanner.close();
            return; 
        }

        System.out.println("Informe o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();
        if (salarioMinimo <= 0) {
            System.out.println("O salário mínimo deve ser um valor positivo. Tente novamente.");
            scanner.close();
            return; 
        }

        Exercicio17 exercicio17 = new Exercicio17(nomeFuncionario, salarioFuncionario, salarioMinimo);

        exercicio17.exibirInformacoes();

        scanner.close();
    }
}

