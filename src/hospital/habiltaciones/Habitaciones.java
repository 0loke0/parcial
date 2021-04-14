/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.habiltaciones;

/**
 *
 * @author loke
 */
public class Habitaciones { //seciones del hospital(consultorios, habitaciones, sala de espera)
    String nombreHabitacion;
    TipoDeSala instalacion;
    String encargado;
    String especialidad;
    boolean estado;//esta en uso?
    
    
    public TipoDeSala getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(TipoDeSala instalacion) {
        this.instalacion = instalacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    
}
