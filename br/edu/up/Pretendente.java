package br.edu.up;

public class Pretendente {
    private String nome;
    private int idade;
    private int grupoRisco;

    public Pretendente(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getGrupoRisco() {
        return grupoRisco;
    }

    public String determinarCategoria() {
        if (idade >= 18 && idade <= 25) {
            return "Seguro para jovens";
        } else if (idade > 25 && idade <= 50 && grupoRisco == 1) {
            return "Seguro padrão";
        } else if (idade > 25 && idade <= 50 && grupoRisco == 2) {
            return "Seguro com desconto";
        } else if (idade > 25 && idade <= 50 && grupoRisco == 3) {
            return "Seguro com sobretaxa";
        } else if (idade > 50 && grupoRisco == 1) {
            return "Seguro com sobretaxa";
        } else {
            return "Seguro não disponível";
        }
    }
}
