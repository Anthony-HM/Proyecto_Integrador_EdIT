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
public class Persona {
    
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    //Start setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //end setters
    
    //star getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }
    //end getters
    
    //construc
    public Persona(String nombre, String apellido ,String dni, int edad){
        super();
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.edad=edad;
        
        
    }
    
    public void programar(){
        System.out.println("NO SE PROGRAMAR");
    }
    
}
