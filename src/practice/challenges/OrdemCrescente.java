package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class OrdemCrescente {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        System.out.println("Lista de números: " + numeros);
        System.out.println("Ordem crescente: " + numeros.stream().sorted().toList());
    }
}
