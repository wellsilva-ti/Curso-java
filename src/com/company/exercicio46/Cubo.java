package com.company.exercicio46;

public class Cubo extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {

    }

    @Override
    public void calculaVolume() {

    }
}
