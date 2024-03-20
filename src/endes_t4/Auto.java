
package endes_t4;



/**
 * Clase auto que representa un coche con marca y modelo.
 * @author Alex
 * @version 1.0 15/03/2024
 */

public class Auto {
    
    /**
     * La marca del coche
     */

    private String marca;

    
    /**
     * El modelo del coche
     */
    private String modelo;

    /**
     * Constructor de la clase Auto.
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método que devuelve un String con la marca del coche.
     * @return La marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que establece la marca del coche
     * @param marca La marca del coche 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método que devuelve un String con el modelo del coche.
     * @return El modelo del coche.
     */
    public String getModelo() {
        return modelo;
    }

     /**
     * Metodo que establece el modelo del coche.
     * @param modelo El modelo del coche.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *  Método que convierte un objeto Auto en un String con sus atributos
     * @return String del auto con sus atributos marca y modelo.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}