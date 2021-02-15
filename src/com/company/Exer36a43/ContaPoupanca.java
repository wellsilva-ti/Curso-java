package com.company.Exer36a43;

public class ContaPoupanca extends ContaBancaria{
    private double diaRendimento;


    //taxa anual 1.4%
    //taxa mensal 0,001166666667
    //taxa diaria 0,00003888888889


    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(double valor){
        double dR = 0.00003888888889;
        dR = valor*dR;
        return dR + valor;
    }

}
