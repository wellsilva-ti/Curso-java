package com.company.cursoLoiane.exe1;

public class Contador{
    public static int valor;


    static int zeraValor(int num){
        valor = num - num;
        System.out.println(valor);
        return valor;
    }
    static int incrementaValor(int num, int incremento){
        valor = num + incremento;
        System.out.println(valor);
        return valor;
    }




}
