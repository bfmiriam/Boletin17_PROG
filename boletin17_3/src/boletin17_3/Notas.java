package boletin17_3;

import javax.swing.JOptionPane;

public class Notas {

    Alumno[] notas = new Alumno[30];

    public Alumno[] crearArray() {

        for (int i = 0; i < notas.length; i++) {
            String nome = JOptionPane.showInputDialog("Introduce nome");
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota:"));
            notas[i] = new Alumno(nome, nota);
        }
        return notas;
    }

    public void amosar(Alumno[] notas) {

        for (Alumno elemento : notas) {
            System.out.println(elemento);
        }
    }

    public void buscarAlumno(Alumno[] notas, String nome) {

        boolean atopado = false;

        for (int i = 0; i < notas.length; i++) {
            if (nome.equalsIgnoreCase(notas[i].getNome())) {
                System.out.println("\nA nota de " + nome + " é " + notas[i].getNota());
                atopado = true;
            }

        }
        if (atopado == false) {
            System.out.println("\nNon se atopou ese alumno.");
        }
    }

    public void notasAprobados() {
        System.out.println("\nLISTA DE APROBADOS: ");

        for (Alumno elemento : notas) {
            if (elemento.getNota() >= 5) {

                System.out.println(elemento.getNome());
            }
        }

    }

    public void ordenar() {

        System.out.println("\nOrdenados de menor a maior nota: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);

        }
    }    

    public void buscarNota(Alumno[] notas) {
        String nome = JOptionPane.showInputDialog("Introduce nome do alumno");
        boolean atopado = false;
        for (int i = 0; i < notas.length; i++) {
            if (nome.equalsIgnoreCase(notas[i].getNome())) {
                System.out.println("\nA nota de " + nome + " é " + notas[i].getNota());
                atopado = true;
            }
        }
    }
}
