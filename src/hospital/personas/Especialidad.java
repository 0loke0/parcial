/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;

import hospital.personas.Personas;

/**
 *
 * @author loke
 */
public class Especialidad { // se encarga de añadir las profeciones 
    //son objetos con su propios Clase 
    String medico;
    String administrativo;
    String presonalDeAseo;
    String seguridad;
    ///otros...

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(String administrativo) {
        this.administrativo = administrativo;
    }

    public String getPresonalDeAseo() {
        return presonalDeAseo;
    }

    public void setPresonalDeAseo(String presonalDeAseo) {
        this.presonalDeAseo = presonalDeAseo;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }
            
            
}
