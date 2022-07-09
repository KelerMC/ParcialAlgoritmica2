/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author Usuario
 */
public class Vuelo {
    private int numero;
    private int horasalida;
    private int horallegada;
    private Date fechasalida;
    private String destino;
   
    public Vuelo(int numero, float precio, int numAsientos, int horasalida, int horallegada, Date fecha, String destino){
        this.numero=numero;
        this.horasalida=horasalida;
        this.horallegada=horallegada;
        
    }
    
}
