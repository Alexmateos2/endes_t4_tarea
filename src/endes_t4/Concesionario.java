/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endes_t4;
import java.util.ArrayList;
/**
 * Clase Concesionario que almacena autos de la clase Auto.
 * @author Alex
 * @version 1.0 15/03/2024
 */
public class Concesionario {

    /**
     * Array de autos de la clase Auto.
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor que inicia el array de autos
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Método que establece el añadido de un auto al array autos,
     * @param auto objeto de la clase Auto.
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Método que devuelve los autos del array.
     * @return  array con los autos establecidos dentro.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Método que imprime por pantalla cada auto dentro del array.
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}