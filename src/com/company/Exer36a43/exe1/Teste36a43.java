package com.company.Exer36a43.exe1;

import java.util.Scanner;

public class Teste36a43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        String resposta;

        System.out.println("Gostaria de criar uma nova conta ?");
        resposta = sc.nextLine();
        if(resposta.equalsIgnoreCase("sim")) {
            System.out.println("Criar conta \n1 - Conta poupanca \t 2 - Conta Especial");
            resposta = sc.nextLine();
            if(resposta.equalsIgnoreCase("1")){
                ContaPoupanca cp = new ContaPoupanca();
                cp.setSaldo(1000);

                System.out.println("Digite o nome do cliente");
                cp.setNomeCliente(sc.nextLine());

                System.out.println("Digite o numero da conta");
                cp.setNumConta(sc.nextLine());

                System.out.println("Qual valor deseja sacar?");
                cp.sacarValor(sc.nextDouble());
                //System.out.printf("Saldo atual %.2f R$ \n", cp.getSaldo());

                //System.out.printf("O rendimento adicionado ao valor do saldo e %.2f R$", cp.calcularNovoSaldo(cp.getSaldo()));

                System.out.println(cp.toString());


            }else if(resposta == "2"){
                ContaEspecial ce = new ContaEspecial();
            }
        }
    }
}
