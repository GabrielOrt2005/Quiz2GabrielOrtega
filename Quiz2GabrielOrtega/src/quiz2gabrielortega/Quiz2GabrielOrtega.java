/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2gabrielortega;



public class Quiz2GabrielOrtega {

   
    public static void main(String[] args) {
        // Quiz2 Gabriel Ortega
        Canciones spotify = new Canciones ();
        System.out.println("id: "+spotify.id);
        System.out.println("nombre cancion: "+spotify.nombrecancion);
        System.out.println("autor: "+spotify.autor);
        System.out.println("Duracion: "+spotify.duracion);
        System.out.println("fechaCreacion: "+spotify.fechaCreacion);
        
        Canciones num = new Canciones ();
        num.setemaildelautor("redhot@gmail.com");
        System.out.println(num.getemaildelautor());
    }
    
}
