package br.edu.up;

import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância total percorrida pelo automóvel (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = calcularConsumoMedio(distancia, combustivel);

        System.out.println("O consumo médio do automóvel é de: " + consumoMedio + " km/l");

        scanner.close();
    }

    private static double calcularConsumoMedio(double distancia, double combustivel) {
        return distancia / combustivel;
    }
}