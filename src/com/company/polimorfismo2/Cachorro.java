package com.company.polimorfismo2;

public class Cachorro extends Mamifero implements AnimalDomesticado,AnimalEstimacao {
    private String tamanho;
    private String raça;

    @Override
    public void emitirSom() {

    }

    @Override
    public void amamentar() {

    }


    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
