
package boletin17_2;


public class Boletin17_2 {

 
    public static void main(String[] args) {
        
        Notas not = new Notas();
        
        int[] notas = not.crearArray();
  
        not.amosar(notas);
        not.aprobadosSuspensos();
        not.notaMedia();
        not.notaAlta();
    }
    
}
