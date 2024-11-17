package ord;

public class sorteio {

    public static void main(String[] args) {
        // Cria instâncias das classes geradorAleatorio, BubbleSort, QuickSort e InsertionSort
        geradorAleatorio gerador = new geradorAleatorio();
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        InsertionSort insertionSort = new InsertionSort();

        // Gera os 250 números aleatórios
        int[] numerosAleatorios = gerador.gerarAleatorio();

        // Exibe números antes da ordenação (Bubble Sort, QuickSort e InsertionSort)
        System.out.println("Antes da ordenação (Bubble Sort, QuickSort e InsertionSort):");
        for (int i = 0; i < 250; i++) {
            System.out.println(numerosAleatorios[i]);
        }

        // Faz uma cópia do array para cada algoritmo, pois os arrays serão ordenados
        int[] numerosParaBubble = numerosAleatorios.clone();
        int[] numerosParaQuick = numerosAleatorios.clone();
        int[] numerosParaInsertion = numerosAleatorios.clone();

        // Medindo o tempo do BubbleSort
        long tempoInicioBubble = System.nanoTime();
        bubbleSort.ordenar(numerosParaBubble);
        long tempoFimBubble = System.nanoTime();
        long tempoBubble = tempoFimBubble - tempoInicioBubble;

        // Exibe números após a ordenação com Bubble Sort
        System.out.println("\nApós a ordenação com Bubble Sort:");
        for (int i = 0; i < 250; i++) {
            System.out.println(numerosParaBubble[i]);
        }
        System.out.println("Tempo gasto com Bubble Sort: " + tempoBubble + " nanosegundos");

        // Medindo o tempo do QuickSort
        long tempoInicioQuick = System.nanoTime();
        quickSort.ordenar(numerosParaQuick);
        long tempoFimQuick = System.nanoTime();
        long tempoQuick = tempoFimQuick - tempoInicioQuick;

        // Exibe números após a ordenação com QuickSort
        System.out.println("\nApós a ordenação com QuickSort:");
        for (int i = 0; i < 250; i++) {
            System.out.println(numerosParaQuick[i]);
        }
        System.out.println("Tempo gasto com QuickSort: " + tempoQuick + " nanosegundos");

        // Medindo o tempo do InsertionSort
        long tempoInicioInsertion = System.nanoTime();
        insertionSort.ordenar(numerosParaInsertion);
        long tempoFimInsertion = System.nanoTime();
        long tempoInsertion = tempoFimInsertion - tempoInicioInsertion;

        // Exibe números após a ordenação com InsertionSort
        System.out.println("\nApós a ordenação com InsertionSort:");
        for (int i = 0; i < 250; i++) {
            System.out.println(numerosParaInsertion[i]);
        }
        System.out.println("Tempo gasto com InsertionSort: " + tempoInsertion + " nanosegundos");
    }
}
