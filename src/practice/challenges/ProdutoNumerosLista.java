package practice.challenges;

import practice.GerarListaInt;

import java.util.List;
import java.util.stream.Stream;

public class ProdutoNumerosLista {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        long produto = numeros.stream().reduce(1, (a, b) -> a * b);

        System.out.println("Lista de números: " + numeros);

        System.out.println("Produto: " + produto);
    }
}
