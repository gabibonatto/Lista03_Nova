package br.edu.up;

public class CalculadoraPesoIdeal {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public CalculadoraPesoIdeal(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public double calcularPesoIdeal() {
        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            pesoIdeal = 0;
        }
        return pesoIdeal;
    }
}

