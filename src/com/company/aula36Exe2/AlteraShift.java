package com.company.aula36Exe2;

public class AlteraShift {
    public static void main(String[] args) {

        String mytext = "Exercícios\tde\tJava\t– Aulas\t44\ta 46 – OO\t– Interfaces\n" +
                "Link do curso: http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/\n" +
                "1. Escreva\tuma\tclasse FiguraGeometrica\tcom\tatributos\tnome\te\tcor.\tEscreva\t\n" +
                "uma\tclasse\tFigura2D\te\tuma\tclasse\tFigura3D.\tAmbas\tclasses\tFigura2D\te\t\n" +
                "Figura3D\tsão\tsubclasses\tda\tclasse\tFiguraGeometrica.\tCrie\tainda\tas\tclasses\t\n" +
                "Circulo,\tQuadrado\te\tTriangulo\tque\testendem\ta\tclasse Figura2D\te crie\t\n" +
                "também\tas\tclasses\tCubo\te\tCilindro e\tPiramide que\testendem\ta\tclasse\t\n" +
                "Figura3D.\n" +
                "2. Escreva\ta\tinterface\tDimensaoSuperficial\tque\tcontém\to\tmétodo\t\n" +
                "calcularArea. Escreva\ta\tinterface\tDimensaoVolumetrica\tque\tcontém\to\t\n" +
                "método\tcalcularVolume.\tAplique\ta\tinterface\tDimensaoSuperficial\tem\t\n" +
                "todas\tas\tsubclasses\tde\tFigura2D\te\tFigura3D\te\taplique\ta\tinterface\t\n" +
                "DimensaoVolumetrica\tnas\tsubclasses\tde\tFigura3D,\timplementando\tseus\t\n" +
                "métodos\tde\tacordo\tcom\tas\tregras\tde\tcada\tfigura\tgeométrica\t(crie\tos\t\n" +
                "atributos\tnecessários).\n" +
                "3. Crie\tpelo\tmenos\tuma\tinstância\tde\tcada\tclasse\te\tadicione\tem\tum\tarray\tdo\t\n" +
                "tipo\tFiguraGeometrica.\tItere\tesse\tarray,\timprimindo\tna\ttela\ta\tarea\te\to\t\n" +
                "volume\t(quando\taplicável). Dica:\tvocê\tpode\tusar\to\toperador\tinstaceOf.";
        mytext = mytext.replaceAll("\t", " ");


        System.out.println(mytext);


    }
}
