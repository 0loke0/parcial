/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author loke
 */
public class Creador {

    String nombreFichero = "c:\\Nueva\\juana.pan";

    public void creadorEmpleado(String nombre, String apellidos, int edad, String genero, int documento,int antiguedad, int sueldo, int idUsuario, String certificados) {

        try {
            FileOutputStream ficheroSalida = new FileOutputStream(nombreFichero);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
// se escriben dos objetos de la clase Persona
            objetoSalida.writeObject(new Personas("", "", 0, "", 0));
            objetoSalida.writeObject(new Personas("", "", 0, "", 0));
            objetoSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    }

    public void lectorEmpleado() {
        String nombreFichero = "c:\\Nueva\\juana.pan";
        try {
            FileInputStream ficheroEntrada = new FileInputStream(nombreFichero);
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
// se leen dos objetos de la clase Persona
            Empleado p1 = (Empleado) objetoEntrada.readObject();
            Empleado p2 = (Empleado) objetoEntrada.readObject();
// se cierra el flujo de objetos objetoEntrada
            objetoEntrada.close();
            System.out.println("DNI\t Nombre");
            System.out.println(p1.persona.getNombre());
            System.out.println(p2.persona.getNombre());
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    }

}
