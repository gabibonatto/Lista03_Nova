package br.edu.up;

public class Carro {
    private int ano;
    private double valor;

    public Carro(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
