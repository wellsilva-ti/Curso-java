package com.company.aula36;

public class FatNaoRecursivo {

    public int fazFat(int num){

        int total= 1;
        for(int i = num; i > 1; i--){
            total *= num;
        }
        System.out.println(total);
        return total;

    }

}
