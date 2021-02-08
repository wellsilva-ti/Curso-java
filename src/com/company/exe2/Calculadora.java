package com.company.cursoLoiane.exe2;

public class Calculadora {

    public static void subtrai(int x, int y){
        int valor = x - y;
        System.out.println("\n\nSubtração: " + valor);
    }
    public static void soma(int x, int y){
        int valor = x + y;
        System.out.println("soma: " + valor);
    }
    public static void mutiplica(double x, double y){
        double valor = x * y;
        System.out.printf("mutiplicação: %.0f\n", valor);
    }
    public static void divide(double x, double y){
        double valor = x / y;
        System.out.printf("divisão: %.2f\n", valor);
    }


    public static int fatorialNaoRecursivo(int num){
        if (num == 0){
            return 1;
        }
        int total = 1;
        for (int i = num; i > 1; i--){
            total *= i;
        }
        return total;
    }

    //fatorial(5) = 5 * fatorial(4)
    //fatorial(4) = 5 * fatorial(3)
    //fatorial(3) = 5 * fatorial(2)
    //fatorial(2) = 5 * fatorial(1)
    //fatorial(1) = 5 * fatorial(0)
    //fatorial(0) = 1
    public static int fatorial (int num1) {
        if (num1 == 0){
           return 1;
        }
        return num1 * fatorial(num1-1);
    }








}



