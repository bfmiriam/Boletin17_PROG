package boletin17_1;

public class Numeros {

    public void amosar(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + "---->" + numeros[i]);
        }

    }

    public int[] crearArray() {

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50) + 1;
        }
        return numeros;
    }

    public void ordenarArray(int[] numeros) {
        System.out.println("\nOrdenado:\n");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println((i + 1) + "--->" + numeros[i]);

        }
    }

}
