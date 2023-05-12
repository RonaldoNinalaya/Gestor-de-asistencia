/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Ronaldo
 */
public class Curso {

     private Estudiante estudiante;
    private String trimetria;
    private String geometria;
    private String algebra;
    
    public Curso(Estudiante estudiante, String trimetria, String geometria, String algebra) {
       this.estudiante = estudiante;
       this.trimetria = trimetria;
       this.geometria = geometria;
       this.algebra = algebra;
       
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * @return the trimetria
     */
    public String getTrimetria() {
        return trimetria;
    }

    /**
     * @param trimetria the trimetria to set
     */
    public void setTrimetria(String trimetria) {
        this.trimetria = trimetria;
    }

    /**
     * @return the geometria
     */
    public String getGeometria() {
        return geometria;
    }

    /**
     * @param geometria the geometria to set
     */
    public void setGeometria(String geometria) {
        this.geometria = geometria;
    }

    /**
     * @return the algebra
     */
    public String getAlgebra() {
        return algebra;
    }

    /**
     * @param algebra the algebra to set
     */
    public void setAlgebra(String algebra) {
        this.algebra = algebra;
    }

    public String getDatosMostrar() {
        return this.estudiante  + " |CURSO: " + this.trimetria 
                                +"  |CURSO: " +this.geometria
                                +"  |CURSO: " +this.algebra;
    }  
    
}
