package br.edu.up;

import java.util.Scanner;

public class Exercicio14 {
    private double precoCusto;
    private double precoVenda;

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        double totalPrecoCusto = 0;
        double totalPrecoVenda = 0;

        System.out.println("Informe o preço de custo e o preço de venda de 40 produtos:");

        for (int i = 1; i <= 40; i++) {
            System.out.println("Produto " + i + ":");
            System.out.print("Preço de custo: ");
            double precoCusto = scanner.nextDouble();
            setPrecoCusto(precoCusto); 
            System.out.print("Preço de venda: ");
            double precoVenda = scanner.nextDouble();
            setPrecoVenda(precoVenda); 

            totalPrecoCusto += getPrecoCusto(); 
            totalPrecoVenda += getPrecoVenda(); 

            if (getPrecoVenda() > getPrecoCusto()) { 
                System.out.println("Produto " + i + ": Lucro");
            } else if (getPrecoVenda() < getPrecoCusto()) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }

        System.out.println("Média de preço de custo: " + (totalPrecoCusto / 40));
        System.out.println("Média de preço de venda: " + (totalPrecoVenda / 40));

        scanner.close();
    }
}
