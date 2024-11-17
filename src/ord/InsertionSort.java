package ord;
public class InsertionSort {

    // Método para ordenar o array usando o algoritmo Insertion Sort
    public void ordenar(int[] array) {
        int n = array.length;
        
        // Passa por todos os elementos do array a partir do segundo
        for (int i = 1; i < n; i++) {
            int chave = array[i]; // Elemento a ser inserido na posição correta
            int j = i - 1;
            
            // Move os elementos maiores que a chave para uma posição à frente
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }
            
            // Coloca a chave na posição correta
            array[j + 1] = chave;
        }
    }
}
