package com.company.aula47;

public class MultiplosCatchJava7 {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 32, 55, 17, 180};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + "= " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Aconteceu um erro");
                // Ari e Array sao da mesma familia entao podemos tratar na mesma linha
            }
        }
        /* ArithmeticException e ArrayIndexOutOfBoundsException sao classes especificas de tratativa de excessao, caso o objetivo sejacolocar
        algo mais generico como "Throwable" ele e colocado apenas depois*/
    }
}
