/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author Usuario
 */
public class Venta {
    private Date fecha;
    private float montoTotal;
    private int numAsientos;
    private Cliente cliente;
    private Empleado empleado;
    private Asiento asiento[]=new Asiento[10];
    private int numAsientos=0;
    
    
    
    public boolean agregarAsiento(Asiento asiento){
        asiento[numAsientos]=asiento;
        numAsientos++;
        return true;
    }
    public boolean setEmpleado(Empleado empleado){
        this.empleado=empleado;
        return true;
    }
    public boolean setCliente(Cliente cliente){
        this.cliente=cliente;
        return true;
    }
}
