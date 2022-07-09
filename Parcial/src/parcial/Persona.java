/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String dni;
    private String nombre;
    
    public Persona(String dni, String nombres){
        this.dni= dni;
        this.nombre=nombres;
    }
    public String getdni(){
        return dni;
    }
    public boolean setdni(String dni){
        this.dni=dni; 
    }
    public String getNombre(){
        return nombre;
    }
    public boolean setNombre(String nombre){
        this.nombre=nombre;        
    } 
    
}
