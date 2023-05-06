/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejercicio1_y_2;

import java.util.ArrayList;

/**
 *
 * @author vane
 */
public class Raza {

    /**
     * @param args the command line arguments
     */
    private String raza;

    public Raza() {
    }

    public Raza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Raza{" + "raza= " + raza + '}';
    }

    
    

}
