package boletin17_4;

public class Boletin17_4 {

    public static void main(String[] args) {

        Dni obj1 = new Dni(67432214);
        String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X",
                        "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        System.out.println("Letra: " + obj1.calcularLetra(obj1.getNif(), letra));

    }

}
