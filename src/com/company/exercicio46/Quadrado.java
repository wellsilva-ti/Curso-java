package com.company.exercicio46;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
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
}
