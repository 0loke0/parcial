/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author loke
 */
public class Medico implements Serializable {

    String ingreso;
    String especialidad;
    String universidad;//egresado
    String jornada;//(Diurno o Nocturno).
    Empleado empleado = new Empleado();
    Scanner sc = new Scanner(System.in);

    public Medico(String ingreso, String especialidad, String universidad, String jornada) {
        this.ingreso = ingreso;
        this.especialidad = especialidad;
        this.universidad = universidad;
        this.jornada = jornada;
    }

    public void creadorMedico() {
        sc.nextLine();
        System.out.println("ingreso");
        this.ingreso = sc.nextLine();
        System.out.println("especialidad");
        this.especialidad = sc.nextLine();
        System.out.println("universidad");
        this.universidad = sc.nextLine();
        System.out.println("jornada(Diurna/nocturno)");
        this.jornada = sc.nextLine();

    }

    public void mostrar() {
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellidos());
        System.out.println(empleado.getEdad());
        System.out.println(empleado.getGenero());
        System.out.println(empleado.getDocumento());
        System.out.println(this.getIngreso());
        System.out.println(this.getEspecialidad());
        System.out.println(this.getUniversidad());
        System.out.println(this.getJornada());

    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }



    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

}
