/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endes_t4;

/**
 *
 * @author Alex
 */
public class ENDES_T4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Auto auto1 = new Auto("Peugeot", "308");
        Auto auto2 = new Auto("Seat", "Leon");

        Concesionario concesionario1 = new Concesionario();

        concesionario1.agregarAuto(auto1);
        concesionario1.agregarAuto(auto2);

        concesionario1.imprimirAutos();
    }
    
}
