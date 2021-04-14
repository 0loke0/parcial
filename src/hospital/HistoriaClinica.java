/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import hospital.personas.Paciente;

/**
 *
 * @author loke
 */
public class HistoriaClinica extends Paciente {
     String patologias;
     String diagnostico;
     String observaciones;

    public HistoriaClinica(String motivoCita, String especialista, String estado, int contacto) {
        super(motivoCita, especialista, estado, contacto);
    }

    public String getPatologias() {
        return patologias;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
     
}
