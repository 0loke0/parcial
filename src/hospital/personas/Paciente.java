/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;

import hospital.HistoriaClinica;
import java.util.Scanner;


/**
 *
 * @author loke
 */
public class Paciente   {
     String motivoCita; // 
    String especialista;// quien lo atiende
    String estado; // internado o de paso
    int contacto; //numero de contacto
   // HistoriaClinica id; //por ahora como string es otra clase
Scanner sc = new Scanner(System.in);
Personas persona = new Personas("", "", 0, "", 0);

 

    public Paciente(String motivoCita, String especialista, String estado, int contacto) {
        this.motivoCita = motivoCita;
        this.especialista = especialista;
        this.estado = estado;
        this.contacto = contacto;
        
    }


        
    
    public void creadorPaciente() {

        System.out.println("motivoCita");
        this.motivoCita=sc.nextLine();
        System.out.println("especialista");
        this.especialista=sc.nextLine();
        System.out.println("estado");
        this.estado=sc.nextLine();
        System.out.println("contacto");
        this.contacto=sc.nextInt();
    }
    public void mostrar() {

        System.out.println(this.getMotivoCita());
        System.out.println(this.getEspecialista());        
        System.out.println(this.getEstado());
        System.out.println(this.getContacto());
       
      

          }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    
    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }
           
    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


   public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }


}
