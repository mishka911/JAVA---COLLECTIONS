/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*
* Se requiere un programa que lea y guarde pa�ses, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedir� un pa�s en un bucle, se guardar� el pa�s en el
conjunto y despu�s se le preguntar� al usuario si quiere guardar otro pa�s o si quiere salir,
si decide salir, se mostrar� todos los pa�ses guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Despu�s deberemos mostrar el conjunto ordenado alfab�ticamente: para esto recordar
c�mo se ordena un conjunto.
Por �ltimo, al usuario se le pedir� un pa�s y se recorrer� el conjunto con un Iterator, se
buscar� el pa�s en el conjunto y si est� en el conjunto se eliminar� el pa�s que ingres� el
usuario y se mostrar� el conjunto. Si el pa�s no se encuentra en el conjunto se le informar�
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
 * @author Vane Proa�o
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
