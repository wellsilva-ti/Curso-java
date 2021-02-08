package com.company.cursoLoiane.aula35;

public class MetodosRecursivos {


    //Formula recursiva
    static long Fibonacci(int n){
        int f = 0;
        int ant = 0;
        for (int i = 1; i <= n; i++){
            if (i == 1){
                f = 1;
                ant = 0;
            }else{
                f += ant;
                ant = f - ant;
            }
            if(i == 9){
                return f;
            }
        }

        return f;
    }
    public static void main(String[] args) {
        Fibonacci(9);
    }

}


