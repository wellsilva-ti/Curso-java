package com.company.aula41Exe1;

public class Aluno extends Pessoa {
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



    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
        s += super.getEndereco();

        return  s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereco do Aluno");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
