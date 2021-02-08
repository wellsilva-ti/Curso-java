package com.company.aula36Exe2;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();

        curso.setNome("Matematica");
        curso.setHorario("5º");

        professor.setDepartamento("Diciplicas UNIX");
        professor.setEmail("amaterazu@gmail.com");
        professor.setNome("Marquinhos");
        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[5];
        for(int i = 0; i <5 ; i++){

            System.out.println("Entre com o nome do aluno: ");
            String nomeAluno = sc.nextLine();

            System.out.println("Entre com o numero da matreicula: ");
            String numMatricula = sc.nextLine();


            double[] notas = new double[4];
            for(int y = 0; y < 4; y ++){
                System.out.println("digite a nota " + (y+1) + "º");
                notas[y] = sc.nextDouble();

            }
            Aluno aluno = new Aluno();
            aluno.setNotas(notas);
            aluno.setNome(nomeAluno);
            aluno.setMatricula(numMatricula);

            alunos[i] = aluno;

        }

        curso.setAlunos(alunos);



    }
}
