package nuevomenu;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Derivadas {
    
    private String funcion;
    
    public Derivadas(String funcion) {
        this.funcion = funcion;
    }
    
    public String derivar() {
        try {
            DJep djep = new DJep();
            // Agrega funciones estándares cos(x), sin(x)
            djep.addStandardFunctions();
            // Agrega constantes estándares: pi, e, etc.
            djep.addStandardConstants();
            // Permite variables no declarables
            djep.setAllowUndeclared(true);
            // Permite asignaciones
            djep.setAllowAssignment(true);
            // Regla de multiplicación implícita para sustracción y sumas
            djep.setImplicitMul(true);
            // Agrega reglas de diferenciación estándar
            djep.addStandardDiffRules();
            
            // Parsea la función ingresada por el usuario
            Node nodoFuncion = djep.parse(this.funcion);
            // Deriva la función con respecto a x
            Node nodoDerivada = djep.differentiate(nodoFuncion, "x");
            // Simplifica la función derivada
            nodoDerivada = djep.simplify(nodoDerivada);
            // Convierte la función derivada en un String
            String derivada = djep.toString(nodoDerivada);
            
            return derivada;
        } catch (ParseException e) {
            System.out.println("Error: " + e.getErrorInfo());
            return "NaN";
        }
    }
}
