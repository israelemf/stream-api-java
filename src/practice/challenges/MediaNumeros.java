package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class MediaNumeros {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();
        List<Integer> numerosMaiorCinco = numeros.stream().filter(numero -> numero > 5).toList();

        double media = (double) numerosMaiorCinco.stream().reduce(0, Integer::sum) / numerosMaiorCinco.stream().count();

        System.out.println("Lista de números: " + numeros);
        System.out.println("Números maiores que cinco: " + numerosMaiorCinco);
        System.out.println("Média dos números maiores que cinco: " + media);


    }
}
