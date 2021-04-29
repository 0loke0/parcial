/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author loke
 */
public class Empleado {

    int antiguedad;// fechaVinculacion;
    int sueldo;

    int idUsuario;
    String certificados;
    Personas persona = new Personas("", "", 0, "", 0);
    Scanner sc = new Scanner(System.in);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public Empleado(int antiguedad, int sueldo, int idUsuario, String certificados) {

        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
        this.idUsuario = idUsuario;
        this.certificados = certificados;
        
    }


    

    /*   public void sEmpleado(){
    this.ocupaciones= ""; 
    this.antiguedad=0;// fechaVinculacion;
    this.sueldo=0;
    this.horaDeInicio=0;
    this.horaDeSalida=0;
    this.idUsuario=0; 
    this.certificados="";
    }*/
    public void creadorEmpleado(int x) throws IOException {
        

            


    
           

            sc.nextLine();
            /// propios de Empleado
            System.out.println("antiguedad");
            this.antiguedad = sc.nextInt();


            System.out.println("sueldo");
            this.sueldo = sc.nextInt();


            System.out.println("idUsuario");
            this.idUsuario = sc.nextInt();


            sc.nextLine();

            System.out.println("certificados");
            this.certificados = sc.nextLine();


   

    }

    

    public void mostrar() {

        System.out.println(persona.getNombre());
        System.out.println(persona.getApellidos());
        System.out.println(persona.getEdad());
        System.out.println(persona.getGenero());
        System.out.println(persona.getDocumento());
        System.out.println(this.getAntiguedad());
        System.out.println(this.getIdUsuario());
        System.out.println(this.getCertificados());

    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCertificados() {
        return certificados;
    }

    public void setCertificados(String certificados) {
        this.certificados = certificados;
    }

}
