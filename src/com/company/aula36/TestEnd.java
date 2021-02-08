package com.company.aula36;

public class TestEnd {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Contato contato = new Contato();
        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();

        contato.setNome("Wellington Marcio da Silva");
//      contato.setTelefone("034 99123 4244");

        contato.setEndereco(endereco);

        endereco.setCep("38408270");
        endereco.setCidade("Uberlandia");
        endereco.setComplemento("Bloco 13 Ap 403");
        endereco.setRua("America 120");
        endereco.setNumCasa("15");
        endereco.setEstado("Minas Gerais");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;


        telefone.setDdd("034");
        telefone.setNumero("99999 9999");
        telefone.setTipo("Celular");

        telefone2.setDdd("034");
        telefone2.setNumero("3211 5566");
        telefone2.setTipo("Fixo");

        contato.setTelefones(telefones);

        if (contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }

        }



        System.out.println(contato.getNome());

//        if(contato != null && contato.getTelefone() != null) {
//            System.out.println(contato.getTelefone().getDdd() + " " +  contato.getTelefone().getNumero());
//        }

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }



    }
}
