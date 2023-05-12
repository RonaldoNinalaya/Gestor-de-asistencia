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
public class Aula {

    private Estudiante estudiante;
    private String mañana;
    private String tarde;
    private String noche;

    public Aula(Estudiante estudiante, String mañana, String tarde, String noche) {
        this.estudiante = estudiante;
        this.mañana = mañana;
        this.tarde = tarde;
        this.noche = noche;
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
     * @return the mañana
     */
    public String getMañana() {
        return mañana;
    }

    /**
     * @param mañana the mañana to set
     */
    public void setMañana(String mañana) {
        this.mañana = mañana;
    }

    /**
     * @return the tarde
     */
    public String getTarde() {
        return tarde;
    }

    /**
     * @param tarde the tarde to set
     */
    public void setTarde(String tarde) {
        this.tarde = tarde;
    }

    /**
     * @return the noche
     */
    public String getNoche() {
        return noche;
    }

    /**
     * @param noche the noche to set
     */
    public void setNoche(String noche) {
        this.noche = noche;
    }
    
    
    
}
