package com.company.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String curso;
    private String matricula;
    private double[] notas;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        if(curso.equalsIgnoreCase(((Aluno) o).getCurso())){
            return true;
        }
        return curso.equals(aluno.curso) &&
                Arrays.equals(notas, aluno.notas);
    }

    //http://commons.apache.org/proper/commons-lang/
    //www.slideshare.net/loiane/curso-java-basico-exercicios-36-a-43

    @Override
    public int hashCode() {
        int result = Objects.hash(curso);
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }

    //@Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
       // s += super.getEndereco();

        return  s;
    }

   //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereco do Aluno");
        System.out.println(this.obterEtiquetaEndereco());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }


}
