/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;

import java.util.Scanner;

/**
 *
 * @author loke
 */
public class Personas { // personas que laboran
    
    //Especialidad ID:0//
    String nombre;
    String apellidos;
    int edad;
    String genero;
    int documento;
   Scanner sc = new Scanner(System.in);
   
    public Personas(String nombre, String apellidos, int edad, String genero, int documento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
    }


  
    

     public void creadorPersonas() {
            sc.nextLine();
            System.out.println("nombre");
            this.nombre = sc.nextLine();
          

            System.out.println("apellidos");
            this.apellidos = sc.nextLine();
          

            System.out.println("Edad");
            this.edad = sc.nextInt();
           

            sc.nextLine();

            System.out.println("Genero");
            this.genero = sc.nextLine();
            

            System.out.println("Documento");
            this.documento = sc.nextInt();
           

            sc.nextLine();
       

    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
        




  



   /* public Especialidad getID() {
        return ID;
    }

    public void setID(Especialidad ID) {
        this.ID = ID;
    }*/


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

  

  




    
    
}
