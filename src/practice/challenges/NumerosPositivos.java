package practice.challenges;

import practice.GerarListaInt;

import java.util.List;

public class NumerosPositivos {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        List<Integer> numeros = gerarListaInt.getNumeros();

        boolean validarPositivo = numeros.stream().noneMatch(numero -> numero < 0);

        System.out.println("Lista de números: " + numeros);

        System.out.println("Todos os números são positivos: " + (validarPositivo ? "Sim" : "Não"));
    }
}
