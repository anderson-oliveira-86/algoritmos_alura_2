package br.com.alura.notas;

public class TestaIntercalaEmUmArray {

    public static void main(String[] args) {

        Nota[] notas = {
                new Nota("andre" , 4),
                new Nota("mariana" , 5),
                new Nota("carlos" , 8.5),
                new Nota("paulo" , 9),
                new Nota("jonas" , 3),
                new Nota("juliana" , 6.7),
                new Nota("guilherme" , 7),
                new Nota("lucia" , 9.3),
                new Nota("ana" , 10)
        };

        Nota[] notasTexto = {
                new Nota("ana" , 10),
                new Nota("carlos" , 8.5),
                new Nota("jonas" , 3),
                new Nota("mariana" , 5),
                new Nota("andre" , 4),
                new Nota("guilherme" , 7),
                new Nota("juliana" , 6.7),
                new Nota("lucia" , 9.3),
                new Nota("paulo" , 9)
        };

        Nota[] rank = intercala(notas , 0 , 4 , notas.length);
        Nota[] texto = intercalaTexto(notasTexto , 0 , 4 ,notasTexto.length );

        for (Nota nota: rank) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }

        System.out.println(" - ");

        for (Nota nota: texto) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static Nota[] intercala(Nota[] notas , int inicial , int miolo , int termino ) {
        Nota[] resultado = new Nota[termino - inicial];

        int atual = 0;
        int atual1 = inicial;
        int atual2 = miolo;

        while (atual1 < miolo && atual2 < termino){
            Nota nota1 = notas[atual1];
            Nota nota2 = notas[atual2];

            if(nota1.getValor() < nota2.getValor()){
                resultado[atual] = nota1;
                atual1++;
            }else{
                resultado[atual] = nota2;
                atual2++;
            }
            atual++;
        }
        while(atual1 < miolo){
            resultado[atual] = notas[atual1];
            atual1++;
            atual++;
        }
        while (atual2 < termino){
            resultado[atual] = notas[atual2];
            atual2++;
            atual++;
        }

        for (int contador = 0; contador < atual; contador++) {
            notas[inicial + contador] = resultado[contador];
        }
        return notas;
        
    }

    private static Nota[] intercalaTexto(Nota[] notas , int inicial , int miolo , int termino ) {
        Nota[] resultado = new Nota[termino - inicial];

        int atual = 0;
        int atual1 = inicial;
        int atual2 = miolo;

        while (atual1 < miolo && atual2 < termino){
            Nota nota1 = notas[atual1];
            Nota nota2 = notas[atual2];

            if(nota1.getAluno().compareTo(nota2.getAluno()) < 0){
                resultado[atual] = nota1;
                atual1++;
            }else{
                resultado[atual] = nota2;
                atual2++;
            }
            atual++;
        }
        while(atual1 < miolo){
            resultado[atual] = notas[atual1];
            atual1++;
            atual++;
        }
        while (atual2 < termino){
            resultado[atual] = notas[atual2];
            atual2++;
            atual++;
        }

        for (int contador = 0; contador < atual; contador++) {
            notas[inicial + contador] = resultado[contador];
        }
        return notas;

    }

}
