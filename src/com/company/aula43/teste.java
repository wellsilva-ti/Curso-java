package com.company.aula43;

public class teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setCurso("Ciência da computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);


        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Sistemas da Informação");
        double[] notas2 = {10, 10, 8, 7};
        aluno2.setNotas(notas);

        System.out.println(aluno);

        String s1 = "adwdrtsda";
        String s2 = "adwdrtsda";

        System.out.println(s1.equals(s2));

        System.out.println(aluno.equals(aluno2));
    }
}
