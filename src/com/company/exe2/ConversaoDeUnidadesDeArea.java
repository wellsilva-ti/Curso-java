package com.company.cursoLoiane.exe2;

public class ConversaoDeUnidadesDeArea {

    public double metroQuadrado;
    public double pesQuadrados;
    public double milhaQuadrada;
    public double acre;



    public static void converteMetroQdParaPesQd(double valor) {
        double valorConvertido = valor * 10.76;
    }

    public static double pésParaCentimetros(double pés) {
        double centimetros = pés * 30.48;
        return centimetros;
    }

    public static void converteMilhaQdParaAcres(double valor) {
        double valorConvertido = valor * 640;
    }

    public static void converteAcreParaPesQd(double valor) {
        double valorConvertido = valor * 43.560;
    }


}
