package com.company.aula36;

import com.company.aula36.FatNaoRecursivo;

import java.util.Locale;
import java.util.Scanner;

public class TestFat {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        FatNaoRecursivo ft = new FatNaoRecursivo();

        System.out.println("Passe o numero para ser calculado: ");
        ft.fazFat(sc.nextInt());



    }
}
