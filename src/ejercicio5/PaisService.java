/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*
* Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class PaisService {
    
    HashSet<Pais> lista = new HashSet();
    Scanner leer = new Scanner (System.in);
    int opcion;
  
public void crearPaises(){
    
    do {
        System.out.println("Ingrese el pais que desee ingresar: ");
        leer.nextLine();
   String pais1 = leer.nextLine().toLowerCase();
        System.out.println("Desea ingresar otro pais?\nS/N");
          
        Pais country = new Pais (pais1);
        lista.add(country);
        
    } while (leer.next().equalsIgnoreCase("s"));
 
} 

public void mostrarPaises(){
    for (Pais pais : lista) {
        System.out.println(pais);
    }
}

public void ordenarPaises(){
    ArrayList<Pais> ordenar = new ArrayList<>(lista);
    Collections.sort(ordenar, Pais.orden); //por ser listado usar collections
    for (Pais pais : ordenar) {
        System.out.println(pais);
        
    }
    }
    

    
public void eliminarpaises(){
    System.out.println("cual pais desea eliminar?");
    leer.nextLine();
    String eliminado = leer.nextLine();
    
    Iterator <Pais> ite = lista.iterator();
    boolean encontrado = false;
    
    while (ite.hasNext()) {
        if (ite.next().getPaises().equalsIgnoreCase(eliminado)) {
            ite.remove();
            encontrado= true;
            
        }
        
    }
    
    if (encontrado) {
        System.out.println("El pais " +eliminado+ " fue eliminado");
        System.out.println("La lista actualizada es la siguiente: ");
        for (Pais pais2 : lista) {
            System.out.println(pais2);
            
        } 

    } else{
        System.out.println("el pais ingresado no se encuentra en el listado");
    }
}


    public void crearMenu(){
    do {
            System.out.println("*********************************************");
            System.out.println("*******************PAISES********************");
            System.out.println("*********************************************");

            System.out.println("Bienvenido al menu, digite su opcion: ");
            System.out.println("0- Crear los paises "
                    + "\n1- Mostrar todos los paises "
                    + "\n2- Ordenar los paises alfabeticamente"
                    + "\n3- Eliminar paises "
                    + "\n4- Salir ");
            
            opcion = leer.nextInt();
  
            switch (opcion){
                case 0:
                  crearPaises();
                  System.out.println("");
                  break;
                case 1:
                   mostrarPaises();
                   System.out.println("");
                   break;
                case 2:
                  ordenarPaises();
                  System.out.println("");
                  break;
                case 3:
                 eliminarpaises();
                 System.out.println("");
                 break;
                 
                case 4:
                    System.out.println("Gracias por usar nuestro sistema :)");
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("Opcion no disponible.");
                    System.out.println("");
                    break;
            }
                    
        
    } while (opcion != 4);
}
}
