package boletin17_2;

import javax.swing.JOptionPane;

public class Notas {

    int[] notas = new int[30];

    public void amosar(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota " + (i + 1) + ": " + notas[i]);
        }
    }

    public int[] crearArray() {

        for (int i = 0; i < notas.length; i++) {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota:"));
            notas[i] = nota;
        }
        return notas;
    }

    public void aprobadosSuspensos() {
        int aprobados = 0, suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
    }

    public void notaMedia() {
        int media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];

        }
        System.out.println("media: " + (media / notas.length));
    }

    public void notaAlta() {
        int i, j;
        int aux=0;
        for (i = 0; i < notas.length - 1; i++) {
            for (j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;

                }
            }
        }
        System.out.println("nota máis alta: "+aux);
    }
}
