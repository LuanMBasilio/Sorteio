package ord;

public class BubbleSort {

    // Método para ordenar o array usando o algoritmo Bubble Sort
    public void ordenar(int[] array) {
        int n = array.length;
        boolean trocou;

        // Bubble sort: Vai passar pelo array várias vezes e "empurrar" os maiores números para o final
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            // Se não houve troca, o array já está ordenado
            if (!trocou) break;
        }
    }
}
