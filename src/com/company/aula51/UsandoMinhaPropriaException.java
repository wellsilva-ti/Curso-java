package com.company.aula51;

public class UsandoMinhaPropriaException {
    public static void main(String[] args) {


        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 6};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if(numeros[i] % 2 != 0){
                    // lançar a exception aqui
                    throw new Exception("Numero impar, divisao não exata");
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + "= " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Aconteceu um erro");

            }catch (Exception e){
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            }
        }

    }
}


