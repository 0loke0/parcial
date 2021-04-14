/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;


import java.util.Date;
/**
 *
 * @author loke
 */
public class Citas {
    Paciente id;
    String nombre;
    int edad;
    String genero;
    String documento;
    Date Ingreso; // Cuando ingrese
    Date Salida; // Cuando sale 
    int idUsuario;
    String dolencia;
    String remisiones; //lugar de donde fue enviado

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Paciente getId() {
        return id;
    }

    public void setId(Paciente id) {
        this.id = id;
    }

    public Date getIngreso() {
        return Ingreso;
    }

    public void setIngreso(Date Ingreso) {
        this.Ingreso = Ingreso;
    }

    public Date getSalida() {
        return Salida;
    }

    public void setSalida(Date Salida) {
        this.Salida = Salida;
    }

    public String getRemisiones() {
        return remisiones;
    }

    public void setRemisiones(String remisiones) {
        this.remisiones = remisiones;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }
    
}
