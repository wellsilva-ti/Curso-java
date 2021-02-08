package com.company.aula36Exe1;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        Contato[] contatos = new Contato[3];
        Contato contato = new Contato();
        Contato contato1 = new Contato();
        Contato contato2 = new Contato();



        contatos[0] = contato;
        contatos[1] = contato1;
        contatos[2] = contato2;


        contato.setNome(sc.nextLine());
        contato.setTelefone(sc.nextLine());
        contato.setEmail(sc.nextLine());

        contato1.setNome(sc.nextLine());
        contato1.setTelefone(sc.nextLine());
        contato1.setEmail(sc.nextLine());

        contato2.setNome(sc.nextLine());
        contato2.setTelefone(sc.nextLine());
        contato2.setEmail(sc.nextLine());

        agenda.setContatos(contatos);

        if(contato != null && agenda.getContatos() !=null){

            System.out.println(contato.getNome());
            System.out.println(contato.getTelefone());
            System.out.println(contato.getEmail());

            System.out.println(contato1.getNome());
            System.out.println(contato1.getTelefone());
            System.out.println(contato1.getEmail());

            System.out.println(contato2.getNome());
            System.out.println(contato2.getTelefone());
            System.out.println(contato2.getEmail());


        }

    }
}
