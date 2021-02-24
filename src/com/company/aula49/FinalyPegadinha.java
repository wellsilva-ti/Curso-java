package com.company.aula49;

public class FinalyPegadinha {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 32, 55, 17, 180};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + "= " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
                System.exit(0);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array invalida");
                System.exit(0);
            } finally {
                System.out.println("essa linha sempre sera executada depois do try e do catch");
            }
        }

    }


}
