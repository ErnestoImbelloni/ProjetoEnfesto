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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public String toString() {
        return "Molde{" +
                "nome='" + nome + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                '}';
    }
}
