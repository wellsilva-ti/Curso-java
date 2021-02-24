package com.company.aula49;

public class Finaly {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 32, 55, 17, 180};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + "= " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Aconteceu um erro");
                // Ari e Array sao da mesma familia entao podemos tratar na mesma linha
            } finally {
                System.out.println("essa linha sempre sera executada depois do try e do catch");
            }
        }

    }
}
