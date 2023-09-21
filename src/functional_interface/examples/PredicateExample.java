package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        List<Integer> numerosPares = numeros.stream()
                .filter(isPar)
                .collect(Collectors.toList());

        // Declarando o Predicate direto no método Filter
        List<Integer> declaracaoDireta = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        // Imprimir a lista de números pares
        System.out.println(numeros);
        System.out.println("Números pares");
        numerosPares.forEach(System.out::println);

        // Criar uma lista de String
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Javascript", "C", "GO", "Ruby");

        // Declarando o Predicate no Método Filter do Stream API para verificar se a palavra tem mais de 5 letras e exibir
        System.out.println("\nPalavras com mais de 5 caracteres");
        palavras.stream().filter(numero -> numero.length() > 5).forEach(System.out::println);
    }
}
