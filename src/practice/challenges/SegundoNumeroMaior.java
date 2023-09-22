package practice.challenges;

import practice.GerarListaInt;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class SegundoNumeroMaior {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        int segundoNumeroMaior = numeros.stream()
                .distinct() // Remove elementos repetidos
                .sorted(Comparator.reverseOrder())// Ordena os números na ordem decrescente
                .skip(1) // Pula o primeiro número da ordem decrescente
                .findFirst(). // Busca o primeiro elemento após skip anterior
                orElseThrow(() -> new NoSuchElementException("A lista está vazia."));

        System.out.println("Lista de números: " + numeros);

        System.out.println("Segundo número maior da lista: " + segundoNumeroMaior);
    }
}
