package boletin17_4;

import javax.swing.JOptionPane;

public class Dni {

    private int nif;

    public Dni() {
    }

    public Dni(int dni) {
        this.nif = dni;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "dni:" + nif;
    }

    public String calcularLetra(int dni, String[] letra) {
        int resto = (dni % 23);
        return letra[resto];
    }
}
