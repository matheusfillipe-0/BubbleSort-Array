package org.arraySort;
import java.util.Arrays;
import static org.arraySort.MethodBubbleSort.bubbleSort; // Importa o método bubbleSort da classe MethodBubbleSort
import static org.arraySort.MethodRadom.populateArray; // Importa o método populateArray da classe MethodRadom

public class Display {

    public static void main(String[] args) {

        // Cria um array de inteiros com 20 elementos
        int[] yourArray = new int[20];

        System.out.println("\n");
        // Preenche o array com valores aleatórios
        populateArray(yourArray);
        // Imprime o array gerado
        System.out.println("Generated Array: " + Arrays.toString(yourArray));
        System.out.println("\n");
        // Ordena o array usando o algoritmo Bubble Sort
        bubbleSort(yourArray);
        // Imprime o array após a ordenação
        System.out.println("After Bubble Sort: " + Arrays.toString(yourArray));
        System.out.println("\n");
    }
}

