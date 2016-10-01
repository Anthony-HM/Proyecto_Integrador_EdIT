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
public abstract class Empleado extends Persona {
   
    private String legajo;

    //getter
    public String getLegajo() {
        return legajo;
    }
    //setter
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    
    public Empleado (String legajo, String nombre, String apellido, String dni, int edad){
        super (nombre, apellido, dni, edad);
        this.legajo= legajo;
    }
    
    public void programar(){
        System.out.println("NO SE");
    }
    
   
    
      public abstract void trabajar();

    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + '}';
    }
    
   
    
    
}
