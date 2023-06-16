/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoauto;

import Principal.Auto;
import Principal.Autobus;
import Principal.Decarga;
import Principal.Deportivo;

/**
 *
 * @author Ismasant
 */
public class ProyectoAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Auto miauto = new Auto("123MBU", "GRIS", 5, "STANDAR");
        System.out.println(miauto.verDatos());
        
        Auto miautodpertivo = new Deportivo("Volswagen", 8, "456MHJ", "blanco", 6, "Standar");
        Deportivo deportivo = new Deportivo("Volswagen", 8, "456MHJ", "blanco", 6, "Standar");
        System.out.println(miautodpertivo.verDatos());
        
        
        Auto autobus = new Autobus(80, 2, "123FGN", "verde", 0, "Standar");
        Autobus autobus1 = new Autobus(80, 2, "123FGN", "verde", 0, "Standar");
        
        Decarga carga = new Decarga("DIesel", 40, "567HNM", "rojo", 18, "standar");
        Auto carga1 =  new Decarga("DIesel", 40, "567HNM", "rojo", 18, "standar");

    }
    
}
