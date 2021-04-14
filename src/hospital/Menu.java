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
    Empleado[] listaEmp = new Empleado[10];
    Paciente[] listaPac = new Paciente[10];
    Medico[] listaMed = new Medico[10];
    Habitaciones[] listaHab= new Habitaciones[10];
   
    
    
    public void crearPersonas() throws IOException{
    System.out.println("Creador de persomas ");
    System.out.println(" ");
    System.out.println("introdusca el tipo de persona a crear ");
     
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       this.generico();
       
            while (!salir) {
 
            System.out.println("Empleado. Opcion 1");
            System.out.println("Paciente. Opcion 2");
            System.out.println("Medico. Opcion 3");
            System.out.println("mostrar Todo. Opcion 4");
            System.out.println("5. Salir");
  
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
              
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        this.agregarEmpleado();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        this.agregarPaciente();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        this.agregarMedico();
                    break; 
                    case 4:
                        System.out.println("Has seleccionado la opcion 3");
                        
                        this.mostrar();
                        
                        break;   
                        
                    case 5:
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
    
         
    
    
    public void generico(){
             
          for(int i=0;i<listaEmp.length;i++){
          Empleado emp = new Empleado("",0,0,0,0,0,""); 
          
        /*  emp.Personas();
          emp.sEmpleado();*/
          listaEmp[i]=emp;
      }
          for(int i=0;i<listaPac.length;i++){
          Paciente per = new Paciente("","","",0); 
          /*per.Personas();
          per.Paciente();*/
          listaPac[i]=per;
      }
          for(int i=0;i<listaMed.length;i++){
          Medico med = new Medico("","","",""); 
          /*per.Personas();
          per.Paciente();*/
          listaMed[i]=med;
      }
    
    }
    
    
    
    int contadorEmp=0;
    int verificador =0;// verifica si el documento esta repetido
    public void agregarEmpleado() throws IOException{
    
    
    
    if (contadorEmp<10){
      Empleado emp = new Empleado("",0,0,0,0,0,"");      
      
      
        for(int i=0;i<listaEmp.length;i++){// verifica si esta duplicado el documento
            if(listaEmp[i].getDocumento()==emp.getDocumento()&&listaEmp[i].getDocumento()!=0){
                verificador=1;
            }
        }
      
            if(verificador==0){// si no encuntre documento dupliado lo crea
                listaEmp[contadorEmp]=emp;   
                emp.creadorEmpleado(contadorEmp); //crea los documentos 
                contadorEmp++;
            }
            else{
                System.out.println("el Documento ya pertenece a otro usuario");
            }

                verificador=0;//restablece el verificador
      
    }
 }
    
    int contadorPac=0;
    public void agregarPaciente(){
        
    
    
    if (contadorPac<10){
        Paciente pac = new Paciente("","","",0);     
        pac.creadorPaciente();
        for(int i=0;i<listaPac.length;i++){// verifica si esta duplicado el documento
            if(listaPac[i].getDocumento()==pac.getDocumento()){
            verificador=1;
            }
        }
        
            if (verificador==0){
            listaPac[contadorPac]=pac;        
            contadorPac++;
            }
            else
            {
            System.out.println("el Documento ya pertenece a otro usuario");
            }    
    }
 }
    
    
    int contadorMed=0;
    public void agregarMedico(){
        
        Medico med = new Medico("","","","");
        System.out.println("introduca el numero de cedula del empleado");
        med.setDocumento(sc.nextInt());
    if (contadorPac<10){
        for(int i=0;i<listaEmp.length;i++){// verifica si esta duplicado el documento
            if(listaEmp[i].getDocumento()==med.getDocumento()){
            verificador=1;
            med.setNombre(listaEmp[i].getNombre());            
            med.setApellidos(listaEmp[i].getApellidos());
            med.setEdad(listaEmp[i].getEdad());
            med.setGenero(listaEmp[i].getGenero());
            med.setDocumento(listaEmp[i].getDocumento());

            
            }
            }
        
       if (verificador==1){
           med.creadorMedico();
            listaMed[contadorMed]=med;        
            contadorMed++;
            }
            else
            {
                System.out.println("**********************************");
            System.out.println("No se encontro usuario con esa Documento en Empleado");
            System.out.println("**********************************");
            }   
        
        
    
    }
    
    }
    
    


    public void mostrar() throws IOException {
        
        System.out.println("**********EMPLEADOS*************");
        for(int i=0;i<listaEmp.length;i++){
           listaEmp[i].mostrar();  
           System.out.println("***********************************");
           
       } 
       System.out.println("--------PACIENTES----------");
       for(int i=0;i<listaPac.length;i++){
           listaPac[i].mostrar();    
           System.out.println("----------------------------------");
       }
        System.out.println("--------MEDICOS----------");
       for(int i=0;i<listaMed.length;i++){
           listaMed[i].mostrar();    
           System.out.println("----------------------------------");
       }
       

           //Empleados     
       
        File carpeta = new File("C:/Users/loke/Desktop/Nueva/");
        File[] listado = carpeta.listFiles();
       for(int i=0;i<listado.length;i++){
            listaEmp[0].muestraContenido(i);    
           System.out.println("----------------------------------");
       }
      
       
       }

    
    public void crearInventario(){
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
    
    int contadorHab=0;
    public void AgregarHabitacion(){
        if (contadorEmp<10){
            Habitaciones hab = new Habitaciones();      
                
            contadorEmp++;
    }
        
    }
    
    public void crearHabitaciones(){
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

    public void crearCitas(){
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
