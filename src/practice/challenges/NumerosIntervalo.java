package practice.challenges;

import practice.GerarListaInt;

import java.util.List;
import java.util.Scanner;

public class NumerosIntervalo {
    public static void main(String[] args) {
        GerarListaInt gerarListaInt = new GerarListaInt();

        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = gerarListaInt.getNumeros();

        System.out.println("Lista de números: " + numeros);

        System.out.println("Informe o intervalo entre dois números");
        System.out.print("Primeiro número: ");
        int intervalo1 = scanner.nextInt();

        System.out.print("Segundo número: ");
        int intervalo2 = scanner.nextInt();

        List<Integer> numerosNoIntervalo = numeros.stream().filter(numero -> ((numero >= intervalo1 && numero <= intervalo2) || (numero >= intervalo2 && numero <= intervalo1))).toList();

        System.out.println("Números no intervalo: " + numerosNoIntervalo);
    }
}
