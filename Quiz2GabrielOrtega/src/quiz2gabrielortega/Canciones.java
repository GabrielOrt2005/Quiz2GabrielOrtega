/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2gabrielortega;


public class Canciones {
    public int id;
    public String nombrecancion;
    public String autor;
    public int duracion;
    public int fechaCreacion;
    private String emaildelautor = "";

    public String getemaildelautor() {
        return emaildelautor.substring(0,3) + "......" + emaildelautor.substring(emaildelautor.indexOf("@"));
    }

    public void setemaildelautor(String emaildelautor) {
        if (!emaildelautor.contains("@")) {
            System.out.println("Esto no es un número de cancion valido");
        } else{
            this.emaildelautor = emaildelautor;
        }
        this.emaildelautor = emaildelautor;
    }
    
    

    public Canciones(){
        this.id = 32333;
        this.nombrecancion = "Road Trippin";
        this.autor = "Red Hot Chilli Peppers";
        this.duracion = 120;
        this.fechaCreacion = 2000;
    }

   
    }
    
  
