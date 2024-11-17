package ord;
public class QuickSort {

    // Método para ordenar o array utilizando o algoritmo QuickSort
    public void ordenar(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // Função recursiva que implementa o algoritmo QuickSort
    private void quickSort(int[] array, int baixo, int alto) {
        if (baixo < alto) {
            // Encontra o índice de partição
            int pivo = particionar(array, baixo, alto);

            // Ordena a parte esquerda e direita do pivô
            quickSort(array, baixo, pivo - 1);
            quickSort(array, pivo + 1, alto);
        }
    }

    // Método que realiza a partição do array e coloca o pivô no lugar correto
    private int particionar(int[] array, int baixo, int alto) {
        int pivo = array[alto];
        int i = (baixo - 1);

        for (int j = baixo; j < alto; j++) {
            if (array[j] <= pivo) {
                i++;
                // Troca os elementos
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Troca o pivô com o elemento na posição correta
        int temp = array[i + 1];
        array[i + 1] = array[alto];
        array[alto] = temp;

        return i + 1;
    }
}
