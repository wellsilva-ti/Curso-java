package com.company.aula47;

public class VariasExcessoes {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 32, 55, 17, 180};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + "= " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException e) {
                System.out.println("Numero nao divizivel por 0");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Calculo nao feito, valor do denominador nulo");
            }

// Super classe pra tratamento de excessoes de maneira generica Throwable
        }
    }
}
