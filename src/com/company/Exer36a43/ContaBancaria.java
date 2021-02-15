package com.company.Exer36a43;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String sacarValor(double valor) {
        String sv = "";
        if (valor < this.saldo){
            this.saldo -= valor;
            sv = "Saque efetuado, no valor de" + valor + "o saldo restante é de"  + getSaldo();
        }else{
            sv = "O Saldo atual é insulficiente para que seja efetuado o saque! " + getSaldo();
        }


        return sv;
    }

    public void depositaValor(double valor) {
        this.saldo += valor;
    }

}
