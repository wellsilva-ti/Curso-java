package com.company.aula47;

public class Excecao {
    public static void main(String[] args) {

        try{
            int[] vetor = new int[4];

        System.out.println("Antes da exception");

        vetor[4] = 7;

        System.out.println("Esse testo nao será impresso") ;


    }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um indice do vetor que nao existe");
        }
    }


}
