/*
 ejercicio 1 Dise�ar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedir� una raza de perro en un bucle, el mismo se guardar� en la lista y
despu�s se le preguntar� al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrar� todos los perros guardados en el ArrayList.

Ejercico 2 Continuando el ejercicio anterior, despu�s de mostrar los perros, al usuario se le pedir�
un perro y se recorrer� la lista con un Iterator, se buscar� el perro en la lista. Si el perro
est� en la lista, se eliminar� el perro que ingres� el usuario y se mostrar� la lista
ordenada. Si el perro no se encuentra en la lista, se le informar� al usuario y se mostrar�
la lista ordenada.
 */
package ejercicio1_y_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vane Proa�o
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

    

