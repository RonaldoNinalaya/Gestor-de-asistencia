/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Estudiante {

    /**
     * @return the nombre
     */
    
    private String nombre;
    private String curso;
    private int asistencia;
    
    public final static int NO_ASISTIO = 0;
    public final static int ASISTIO = 1;

    public Estudiante(String nombre, String curso, int asistencia) {
        this.nombre = nombre;
        this.curso = curso;
        this.asistencia = asistencia;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the asistencia
     */
    public int getAsistencia() {
        return asistencia;
    }

    /**
     * @param asistencia the asistencia to set
     */
    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
    public String getDatosMostrar() {
        return this.nombre  + " |CURSO:" + this.curso;
    }  
    
}
