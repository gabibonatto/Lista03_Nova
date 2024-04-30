package br.edu.up;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número do exercicio: ");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                Exercicio01.executar();
                break;
            case 2:
                Exercicio02.executar();
                break;
            case 3:
                Exercicio03.executar();
                break;
            case 4:
                Exercicio04.executar();
                break;
            case 5:
                Exercicio05.executar();
                break;
            case 6:
                Exercicio06.executar();
                break;
            case 7:
                Exercicio07.executar();
                break;
            case 8:
                Exercicio08.executar();
                break;
            case 9:
                Exercicio09.executar();
                break;
            case 10:
                Exercicio10.executar();
                break;
            case 11:
                Exercicio11.executar();
                break;
            case 12:
                Exercicio12.executar();
                break;
            case 13:
                Exercicio13.executar();
                break;
            case 14:
                Exercicio14 exercicio14 = new Exercicio14(); 
                exercicio14.executar();
                break;
            case 15: 
                Exercicio15.executar();
                break;
            case 16: 
                Exercicio16.executar();
                break;
            case 17: 
                Exercicio17.executar();
                break;
           // case 18: 
             //   Exercicio18.executar();
               // break;
            case 19: 
               Exercicio19.executar();
               break;
            case 20: 
               Exercicio17.executar();
               break;
            default:    
                System.out.println("Exercicio não encontrado.");
                break;
        }
        scanner.close();
    }
}

