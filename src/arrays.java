import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        // Informando um por um
        int[] numeros = new int[5];
            numeros[0] = 1;
            numeros[1] = 2;
            numeros[2] = 3;
            numeros[3] = 4;
            numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Informando todos os elementos de uma vez
        String[] letras = {"A", "B", "C", "H", "P"};

        for(int j = 0; j < letras.length; j++) {
            System.out.println(letras[j]);
        }

        // Imprimindo sem o laço
        System.out.println(Arrays.toString(letras));
        System.out.println(Arrays.toString(numeros));

    }
}
