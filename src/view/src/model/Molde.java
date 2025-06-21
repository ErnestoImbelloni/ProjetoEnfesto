package model;

public class Molde {
    private String nome;
    private double largura;
    private double altura;

    public Molde(String nome, double largura, double altura) {
        this.nome = nome;
        this.largura = largura;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}
