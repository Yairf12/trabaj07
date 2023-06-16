/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Ismasant
 */
public class Deportivo extends Auto{
    private String marca;
    private int cilindros;

    public Deportivo(String marca, int cilindros, String placa, String color, int velocidades, String transmision) {
        super(placa, color, velocidades, transmision);
        this.marca = marca;
        this.cilindros = cilindros;
    }

    public Deportivo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

  public String verDatos(){
        String datos = "Metodo desde la clase deportivo: "+placa+" "+color+" "+String.valueOf(velocidades)+" "+transmision+" "+marca+String.valueOf(cilindros);
        return datos;
    }
       
  
  public String verDatos(String valor){
        String datos = "Metodo desde la clase deportivo: "+placa+" "+color+" "+String.valueOf(velocidades)+" "+transmision+" "+marca+String.valueOf(cilindros);
        return datos;
    }
    
    
}
