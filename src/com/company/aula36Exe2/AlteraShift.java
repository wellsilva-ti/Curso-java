package com.company.aula36Exe2;

public class AlteraShift {
    public static void main(String[] args) {

        String mytext = "Escreva\tuma\tclasse\tpara\trepresentar\tum\tCurso,\tque\ttem\tnome\te\thorário.\t\n" +
                "Cada\tcurso\ttem\tum\tProfessor,\tque\tpossui\tnome,\tdepartamento\te\temail.\t\n" +
                "Cada\tCurso\ttambém\tpode\tter\tvários\talunos\t(tipo\tAluno).\tCada\tAluno\ttem\t\n" +
                "nome,\tmatricula\te\t4\tnotas. Escreva\tum\tprograma\tteste\tque\tcrie\tum\tCurso\t\n" +
                "com\t5\talunos,\te\tque\tpreça\tpara\to\tusuário\tentrar\tcom\tas\t4\tnotas\tde\tcada\t\n" +
                "aluno.\tAo\tfinal,\timprima\ta\tmédia\tde\tcada\taluno,\tse\to\tmesmo\testá\taprovado\n" +
                "(media\tmaior\tou\tigual\ta\t7),\te\tqual\té\ta\tmédia\tda\tturma.";
        mytext = mytext.replaceAll("\t", " ");


        System.out.println(mytext);


    }
}
