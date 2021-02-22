package com.company.Exer36a43.exe2;

public class PessoaJuridica extends Pessoa{
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public double calculaTaxa(){
        double taxa = this.valor * 0.10;
        return taxa;
    }

}
