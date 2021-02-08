package com.company.aula36Exe1Loiane;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = sc.nextLine();

//        Agenda agenda = new Agenda(nome);
        Agenda agenda = new Agenda();
        agenda.setNome(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as informações do contato " + (i + 1));
            Contato c = new Contato();

            System.out.println("Forneça o nome do contato");
            nome = sc.nextLine();
            c.setNome(nome);

            System.out.println("Forneça o telefone do contato");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);

            System.out.println("Forneça o email do contato");
            String email = sc.nextLine();
            c.setEmail(email);

            contatos[i] = c;

        }
        agenda.setContatos(contatos);
        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
