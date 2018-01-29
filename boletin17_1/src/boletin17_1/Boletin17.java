package boletin17_1;

import java.util.Arrays;

public class Boletin17 {

    public static void main(String[] args) {

        Numeros obxNum = new Numeros();

        int[] numeros = obxNum.crearArray();

        obxNum.amosar(numeros);
        obxNum.ordenarArray(numeros);

    }

}
