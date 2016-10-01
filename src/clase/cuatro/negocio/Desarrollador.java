package clase.cuatro.negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class Desarrollador extends Empleado{
    
    private String señority;
    //seter
    public void setSeñority(String señority) {
        this.señority = señority;
    }
    //getter
    public String getSeñority() {
        return señority;
    }

    //construc
    public Desarrollador (String señority, String legajo, String nombre, String apellido, String dni, int edad){
        super(legajo, nombre, apellido, dni, edad);
        this.señority=señority;

    }
    
    
    public void programar(){
        System.out.println("PROGRAMO COMO UN CAPEON");
    }
    
    
}
