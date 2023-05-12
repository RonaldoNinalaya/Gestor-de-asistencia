/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Ronaldo
 */
public class Asistencia {

    Estudiante estudiante;
    Date fecha;
    
     public Asistencia(Estudiante estudiante, Date fecha) {
        this.estudiante = estudiante;
        this.fecha = fecha;
     }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getDatosMostrar() {
        return this.estudiante  + " |CURSO: " + this.fecha ;
                                
    }  
     
}
