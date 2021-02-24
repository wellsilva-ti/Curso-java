package com.company.aula42;

public class Teste2Casting {
    public static void main(String args[]) {
        //UP CASTING
        //DOWN CASTING
        //INSTANCE OFF

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("É o tipo Pessoa");
        }
        if (aluno instanceof Aluno) {
            System.out.println("É o tipo Aluno");
        }
        if (professor instanceof Professor) {
            System.out.println("É o tipo Professor");
        }

    }
}
