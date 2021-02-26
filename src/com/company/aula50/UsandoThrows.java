package com.company.aula50;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {

        System.out.println("Entre com um numero decimal");
        try {
            double num = leNumero();
            System.out.println("Voce digitou" + num);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }

        /*o printStackTrace so deve ser usado por desenvolvedores afim de identificar os erros com mais exatidao,
        o ususario dever ter uma informação mais amigavel e sem muitas informações*/

        //


    }
    public static double leNumero() throws Exception {
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        return numero;
    }
}
