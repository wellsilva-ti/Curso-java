package com.company.polimorfismo2;

public class Gato extends Mamifero implements AnimalDomesticado,AnimalEstimacao {
    private String raça;

    @Override
    public void amamentar(){

    }
    public void emitirSom(){

    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public void levarVeternario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
