package com.company.Exer36a43.exe1;

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

   public String toString(){
        return  "O nome do cliente e : " + getNomeCliente() +"\n" +
                "O numero da conta e : " + getNumConta() + "\n" +
                "O saldo atual e de  : " + String.format("%.2f",getSaldo()) + "\n" +
                "O valor somado ao dia/rendimento e de :" + String.format("%.2f",calcularNovoSaldo(getSaldo()));
   }

}
