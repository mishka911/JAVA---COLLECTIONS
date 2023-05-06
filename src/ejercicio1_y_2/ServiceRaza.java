/*
 ejercicio 1 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Ejercico 2 Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ejercicio1_y_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class ServiceRaza {

    // Raza r1 = new Raza ();
    ArrayList<Raza> razas = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void crearperros() {
        System.out.println("Ingrese una raza de cualquier perro");
        razas.add(new Raza(leer.nextLine()));

    }

    public void mostrarperros() {
        for (Raza raza : razas) {
            System.out.println(raza.toString());

        }
    }

    public void buscarperro() {
        System.out.println("Que raza de perro desea buscar?");
        String buscar = leer.nextLine().toLowerCase();

        Iterator<Raza> buscador = razas.iterator();
        boolean encontrado = false;
        
        while (buscador.hasNext()) {
            if (buscador.next().getRaza().equalsIgnoreCase(buscar)) {
                buscador.remove();
                encontrado = true;
                
                }
          
            }
        if (encontrado) {
         System.out.println("la raza eliminada fue: " + buscar);
          System.out.println("\nLa lista actualizada es la siguiente: ");
                for (Raza raza1 : razas) {
                    System.out.println(raza1);
                   
                }
        }else {
                
                System.out.println("la raza que usted ingreso no se encuentra en la lista");
            }

        }
    }

    

