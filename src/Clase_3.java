
import clase.cuatro.negocio.Desarrollador;
import clase.cuatro.negocio.Persona;

public class Clase_3 {

    public static void main(String[] args) {
        
        Persona P = new Persona("A","A","1",1);
        //Persona E = new Empleado("b","B","B","2",2);
        Persona D = new Desarrollador("C","C","C","C","3",3);
        
        P.programar();
        //E.programar();
        D.programar();
        
        hacerProgramar(P);
        //hacerProgramar(E);
        hacerProgramar(D);
        
    }
    
    private static void hacerProgramar(Persona P){
        P.programar();
        
    }
    
    
}
