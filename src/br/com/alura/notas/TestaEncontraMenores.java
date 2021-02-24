package br.com.alura.notas;

public class TestaEncontraMenores {
    public static void main(String[] args) {

        Nota guilherme = new Nota("guilherme", 8.5);

        Nota[] notas = {
                new Nota("paulo", 9),
                new Nota("mariana", 5),
                new Nota("juliana", 6.7),
                new Nota("ana", 10),
                new Nota("lucia", 9.3),
                new Nota("jonas", 3),
                new Nota("andre", 4),
                new Nota("carlos", 8.5),
                new Nota("guilherme", 7)
        };

        int menores = encontraMenores(guilherme , notas);
        int menoresComForeach = encontraMenoresComForeach(guilherme, notas);
        System.out.println("Número de menores: " + menores);
    }

    private static int encontraMenoresComForeach(Nota guilherme, Nota[] notas) {
        int menores = 0;
        for (Nota nota: notas) {
            if(nota.getValor() < guilherme.getValor()){
                menores++;
            }
        }
        return menores;
    }

    private static int encontraMenores(Nota guilherme , Nota[] notas){
        int menores = 0;
        for (int atual = 0; atual < notas.length; atual++) {
            Nota nota = notas[atual];

            if(nota.getValor() < guilherme.getValor()){
                menores++;
            }
        }
        return menores;
    }
}
