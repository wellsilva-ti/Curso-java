package com.company.exercicio46;

public class Cilindro extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica{
    private double altura;
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {

    }

    @Override
    public void calculaVolume() {

    }
}
