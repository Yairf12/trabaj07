/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Ismasant
 */
public class Autobus extends Auto{
    private int capacidad;
    private int niveles;

    public Autobus(int capacidad, int niveles, String placa, String color, int velocidades, String transmision) {
        super(placa, color, velocidades, transmision);
        this.capacidad = capacidad;
        this.niveles = niveles;
    }

    public Autobus() {
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

  public String verDatos(){
        String datos = placa+" "+color+" "+String.valueOf(velocidades)+" "+transmision+" "+String.valueOf(capacidad)+" "+String.valueOf(niveles);
        return datos;
    }
       
    
    
    
}
