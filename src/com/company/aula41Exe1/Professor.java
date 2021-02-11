package com.company.aula41Exe1;

public class Professor extends Pessoa {
    private String departamento;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do Professor: ";
        s += super.getEndereco();

        return  s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereco do professor");
        System.out.println(this.obterEtiquetaEndereco());
    }

}
