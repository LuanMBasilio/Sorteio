package ord;
import java.util.Random;

public class geradorAleatorio {

    // Método para gerar 250 números aleatórios e retorná-los em um array
    public int[] gerarAleatorio() {
        int[] numeros = new int[250];
        Random random = new Random();

        // Preenche o array com números aleatórios entre 0 e 999 (por exemplo)
        for (int i = 0; i < 250; i++) {
            numeros[i] = random.nextInt(1000); // Números aleatórios entre 0 e 999
        }

        return numeros;
    }
}


   
