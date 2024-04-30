package br.edu.up;

import java.util.Scanner;

public class Exercicio19 {
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o lado 1 do triângulo:");
        int lado1 = scanner.nextInt();

        System.out.println("Informe o lado 2 do triângulo:");
        int lado2 = scanner.nextInt();

        System.out.println("Informe o lado 3 do triângulo:");
        int lado3 = scanner.nextInt();

        if (verificarTriangulo(lado1, lado2, lado3)) {
            System.out.println("Os lados informados podem formar um triângulo.");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados informados não podem formar um triângulo.");
        }

        scanner.close();
    }

    private static boolean verificarTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
    }
}