package com.company.polimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Peixe peixe = new Peixe();
        Reptil reptil = new Reptil();

        mamifero.correr();
        mamifero.alimenta();
        mamifero.emitirSom();

        peixe.correr();
        peixe.alimenta();
        peixe.emitirSom();

        reptil.correr();
        reptil.alimenta();
        reptil.emitirSom();





    }
}
