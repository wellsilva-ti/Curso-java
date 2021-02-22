package com.company.Exer36a43.exe2;

import java.util.Scanner;

public class TestePfPj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta;
        System.out.println("1 - Pessoa fisica \t 2 - Pessoa juridica");
        resposta = sc.nextLine();

        for(int i = 0; i < 3; i++) {
            if (resposta.equalsIgnoreCase("1")) {
                PessoaFisica pf1 = new PessoaFisica();

                pf1.setNome(sc.nextLine());

                pf1.setValor(sc.nextDouble());


                System.out.println();


            }
            if (resposta.equalsIgnoreCase("2")) {
                PessoaJuridica pj1 = new PessoaJuridica();
                pj1.setNome(sc.nextLine());

                pj1.setValor(sc.nextDouble());


                System.out.println(pj1.calculaTaxa());


            }
        }



    }
}
