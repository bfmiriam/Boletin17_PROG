
package boletin17_3;

import java.util.Arrays;


public class Boletin17_3 {

   
    public static void main(String[] args) {
         
        Notas not = new Notas();
        
        Alumno[] notas = not.crearArray();
  
        not.amosar(notas);
        not.buscarAlumno(notas, "sara");
        not.notasAprobados();
       
        Arrays.sort(notas);
        not.ordenar();
    
        not.buscarNota(notas);
    }
    
}
