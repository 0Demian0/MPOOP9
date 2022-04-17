/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de 
 * una Persona declaracion de la herencia va 
 * a heredar lo que tiene la clase padre permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author josed
 */
public abstract class Persona extends Servivo{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo boolean 
     * privadas para solo acceder a ellas por medio 
     * de metodos de la misma clase
     */
    private boolean alto,ojos,delgado;
    /**
     * Constructor vacío
     */
    public Persona() {
    }
    /**
     * Constructor inicializado con las variables
     * @param alto
     * @param ojos
     * @param delgado 
     */

    public Persona(boolean alto, boolean ojos, boolean delgado) {
        this.alto = alto;
        this.ojos = ojos;
        this.delgado = delgado;
    }

    /**
     *
     * @return
     */
    public boolean isAlto() {
        return alto;
    }

    /**
     *
     * @param alto
     */
    public void setAlto(boolean alto) {
        this.alto = alto;
    }

    /**
     *
     * @return
     */
    public boolean isOjos() {
        return ojos;
    }

    /**
     *
     * @param ojos
     */
    public void setOjos(boolean ojos) {
        this.ojos = ojos;
    }

    /**
     *
     * @return
     */
    public boolean isDelgado() {
        return delgado;
    }

    /**
     *
     * @param delgado
     */
    public void setDelgado(boolean delgado) {
        this.delgado = delgado;
    }

    /**
     *
     * @return
     */
    @Override
    public String nombre() {
        return nombre();
                }

    /**
     *
     * @return
     */
    @Override
    public int edad() {
        return edad();
    }
    
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    
    @Override
    public String toString() {
        return super.toString()+"Persona{" + '}';
    }   
}
