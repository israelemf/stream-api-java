package practice.challenges;

import practice.GerarListaInt;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NumeroNegativo {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        List<Integer> numerosNegativos = numeros.stream().filter(numero ->  numero < 0).toList();

        System.out.println("Lista de números: " + numeros);

        System.out.println(numerosNegativos.isEmpty() ? "\nNão existem números negativos na lista" : "\nExistem números negativos na lista\n" + numerosNegativos);
    }
}
