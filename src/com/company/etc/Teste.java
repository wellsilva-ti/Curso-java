package com.company.cursoLoiane.aula36;

public class Teste extends Contato{
    public static void main(String[] args) {

        Contato contato = new Contato();
        Endereco endereco = new Endereco();

        contato.setNome("Wellington");
        contato.setTelefone("34 991234244");

        // é preciso cetar dentro do contato o construtor endereco
        //contato.setEndereco(endereco);

        endereco.setNumero("121");
        endereco.setEstado("Minas Gerais");
        endereco.setComplemento("Bloco 13 Ap 403");
        endereco.setCidade("Uberlandia");
        endereco.setBairro("Mansour");

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());

        if(contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }




    }
}
