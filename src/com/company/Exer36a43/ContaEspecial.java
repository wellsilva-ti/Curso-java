package com.company.Exer36a43;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String sacarValor(double valor){
        String sv = "";
        if (valor < this.limite){
            this.limite -= valor;
            sv = "Saque efetuado, no valor de" + valor + "o saldo restante é de"  + getSaldo();
        }else{
            sv = "O Saldo atual é insulficiente para que seja efetuado o saque! " + getSaldo();
        }
        return sv;

    }

}
