/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_y_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainRaza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceRaza s1 = new ServiceRaza ();
        Scanner leer = new Scanner (System.in);
        
        
        
        do {
            s1.crearperros();
            System.out.println("Desea ingresar a otra raza de perro? SI/ NO");
            
        } while (leer.nextLine().toUpperCase().equals("SI"));
     
        s1.mostrarperros();
        s1.buscarperro();
    }
    
}
