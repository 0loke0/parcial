/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import hospital.habiltaciones.Habitaciones;
import hospital.Objetos.Inventario;
import hospital.personas.Personas;
import hospital.personas.Citas;
import hospital.personas.Empleado;
import hospital.personas.Medico;
import hospital.personas.Paciente;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author loke
 */
public class Menu {
    //array personal inventario citas\

    Scanner sn = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    ArrayList<Personas> arrayPersonas = new ArrayList();
    ArrayList<Inventario> arrayInventario = new ArrayList();
    ArrayList<Habitaciones> arrayHabitaciones = new ArrayList();
    ArrayList<Citas> arrayCitas = new ArrayList();
    ArrayList<Personas> listaPer = new ArrayList();
    ArrayList<Empleado> listaEmp = new ArrayList();
    ArrayList<Paciente> listaPac = new ArrayList();
    ArrayList<Medico> listaMed = new ArrayList();
    Habitaciones[] listaHab = new Habitaciones[10];
    int totalnumero = 10;

    public void crearPersonas() throws IOException {
        System.out.println("Creador de persomas ");
        System.out.println(" ");
       

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        this.generico();

        while (!salir) {
            System.out.println("introdusca el tipo de persona a crear ");
            System.out.println(" Opcion 1 Personas");
            System.out.println(" Opcion 2 Empleado.");
            System.out.println(" Opcion 3 Medico.");
            System.out.println(" Opcion 4 Paciente.");            
            System.out.println(" Opcion 5 mostrar Todo.");
            System.out.println("6. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        this.agregarPersonas();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        this.agregarEmpleado();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        this.agregarMedico();
                        break;                        
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        this.agregarPaciente();
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");

                        this.mostrar();

                        break;

                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

    public void generico() {
        for (int i = 0; i < totalnumero; i++) {
            Personas per = new Personas("", "", 0, "", 0);

            /*  emp.Personas();
          emp.sEmpleado();*/
            listaPer.add(per);
        }
        for (int i = 0; i < totalnumero; i++) {
            Empleado emp = new Empleado(0, 0, 0, "");

            /*  emp.Personas();
          emp.sEmpleado();*/
            listaEmp.add(emp);
        }
        for (int i = 0; i < totalnumero; i++) {
            Paciente per = new Paciente("", "", "", 0);
            /*per.Personas();
          per.Paciente();*/
            listaPac.add(per);
        }
        for (int i = 0; i < totalnumero; i++) {
            Medico med = new Medico();
            /*per.Personas();
          per.Paciente();*/
            listaMed.add(med);
        }

    }

    int contadorPer = 0;
    int verificadorPer = 0;

    public void agregarPersonas() { // verifica que no tenga otra persona creada con la misma cedula
        Personas per = new Personas("", "", 0, "", 0);
            per.creadorPersonas();
        if (contadorPer < 10) {
            

            for (int i = 0; i < totalnumero; i++) {// verifica si esta duplicado el documento
                if (listaPer.get(i).getDocumento() == per.getDocumento()) {
                    if (per.getDocumento() != 0) {
                        verificadorEmp = 1;
                    }
                }
            }
        }
        if (verificadorPer == 0) {// si no encuntre documento dupliado lo crea

                //crea los documentos 
                listaPer.add(per);

                contadorEmp++;
            } else {
                System.out.println("el Documento ya pertenece a otro usuario");
            }
    }
    int contadorEmp = 0;
    int verificadorEmp = 0;// verifica si el documento esta repetido

    public void agregarEmpleado() throws IOException {

        if (contadorEmp < 10) {
            Empleado emp = new Empleado(0, 0, 0, "");
            emp.creadorEmpleado(contadorEmp);

            for (int i = 0; i < totalnumero; i++) {// verifica si esta duplicado el documento
                if (listaEmp.get(i).getPersona().getDocumento() == emp.getPersona().getDocumento()) {
                    if (emp.getPersona().getDocumento() != 0) {
                        verificadorEmp = 1;
                    }
                }
            }

            if (verificadorEmp == 0) {// si no encuntre documento dupliado lo crea

                //crea los documentos 
                listaEmp.add(emp);

                contadorEmp++;
            } else {
                System.out.println("el Documento ya pertenece a otro usuario");
            }

            verificadorEmp = 0;//restablece el verificador

        }
    }

    int contadorPac = 0;

    public void agregarPaciente() {

        if (contadorPac < 10) {
            Paciente pac = new Paciente("", "", "", 0);
            pac.creadorPaciente();
            for (int i = 0; i < totalnumero; i++) {// verifica si esta duplicado el documento
                if (listaPac.get(i).getPersona().getDocumento() == pac.getPersona().getDocumento()) {
                    verificadorEmp = 1;
                }
            }

            if (verificadorEmp == 0) {
                listaPac.add(pac);
                contadorPac++;
            } else {
                System.out.println("el Documento ya pertenece a otro usuario");
            }
        }
    }

    int contadorMed = 0;

    public void agregarMedico() {

        Medico med = new Medico();
        System.out.println("introduca el numero de cedula del empleado");
        med.getEmpleado().getPersona().setDocumento(sc.nextInt());
        if (contadorPac < 10) {
            for (int i = 0; i < totalnumero; i++) {// verifica si esta duplicado el documento
                if (listaEmp.get(i).getPersona().getDocumento() == med.getEmpleado().getPersona().getDocumento()) {
                    verificadorEmp = 1;
                    med.getEmpleado().getPersona().setNombre(listaEmp.get(i).getPersona().getNombre());
                    med.getEmpleado().getPersona().setApellidos(listaEmp.get(i).getPersona().getApellidos());
                    med.getEmpleado().getPersona().setEdad(listaEmp.get(i).getPersona().getEdad());
                    med.getEmpleado().getPersona().setGenero(listaEmp.get(i).getPersona().getGenero());
                    med.getEmpleado().getPersona().setDocumento(listaEmp.get(i).getPersona().getDocumento());

                }
            }

            if (verificadorEmp == 1) {
                med.creadorMedico();
                listaMed.add(med);
                contadorMed++;
            } else {
                System.out.println("**********************************");
                System.out.println("No se encontro usuario con esa Documento en Empleado");
                System.out.println("**********************************");
            }

        }

    }

    public void mostrar() throws IOException {

        System.out.println("**********EMPLEADOS*************");
        for (int i = 0; i < listaEmp.size(); i++) {
            listaEmp.get(i).mostrar();
            System.out.println("***********************************");

        }
        System.out.println("--------PACIENTES----------");
        for (int i = 0; i < listaPac.size(); i++) {
            listaPac.get(i).mostrar();
            System.out.println("----------------------------------");
        }
        System.out.println("--------MEDICOS----------");
        for (int i = 0; i < listaMed.size(); i++) {
            listaMed.get(i).mostrar();
            System.out.println("----------------------------------");
        }

        //Empleados     
        /*File carpeta = new File("C:/Users/loke/Desktop/Nueva/");
        File[] listado = carpeta.listFiles();
        for (int i = 0; i < listado.length; i++) {
            listaEmp.get(i).muestraContenido(i);
            System.out.println("----------------------------------");
        }*/

    }

    public void crearInventario() {
        System.out.println("Creador de Inventario ");
        System.out.println(" ");
        System.out.println("introdusca el tipo de Inventario a crear ");

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("Empleado. Opcion 1");
            System.out.println("Paciente. Opcion 2");
            System.out.println("3. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

    int contadorHab = 0;

    public void AgregarHabitacion() {
        if (contadorEmp < 10) {
            Habitaciones hab = new Habitaciones();

            contadorEmp++;
        }

    }

    public void crearHabitaciones() {
        System.out.println("Creador de Habitaciones ");
        System.out.println(" ");
        System.out.println("introdusca el tipo de habitacion a crear ");

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("Empleado. Opcion 1");
            System.out.println("Paciente. Opcion 2");
            System.out.println("3. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

    public void crearCitas() {
        System.out.println("Creador de Citas ");
        System.out.println("Creador de persomas ");
        System.out.println(" ");
        System.out.println("introdusca el tipo de persona a crear ");

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("Empleado. Opcion 1");
            System.out.println("Paciente. Opcion 2");
            System.out.println("3. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}
