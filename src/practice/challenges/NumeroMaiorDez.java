package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class NumeroMaiorDez {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        boolean validarMaiorDez = numeros.stream().anyMatch(numero -> numero > 10);

        List<Integer> numerosMaiorDez = numeros.stream().filter(numero -> numero > 10).toList();

        System.out.println("Lista de números: " + numeros);

        System.out.println("Existe número maior que dez: " + (validarMaiorDez ? "Sim" : "Não"));

        System.out.println(numerosMaiorDez.isEmpty() ? "Não existem números maior que 10 na lista." : "Números maior que dez: " + numerosMaiorDez);

    }
}
