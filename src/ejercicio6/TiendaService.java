/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
*productos que venderemos y el precio que tendrán. Además, se necesita que la
*aplicación cuente con las funciones básicas.
*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
*eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
*Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
*Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class TiendaService {

    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> productos = new HashMap();
    int option;

    public void crearProducto() {
        do {
            System.out.println("Ingrese el producto que desee ingresar: ");
            leer.nextLine();
            String producto1 = leer.nextLine().toLowerCase();
            System.out.println("Ingrese el precio de " + producto1+":");
            double precio1 = leer.nextDouble();
            leer.nextLine();
            System.out.println("Desea ingresar otro producto?\nS/N");
          
            productos.put(producto1, precio1);

        } while (leer.next().equalsIgnoreCase("s"));
    }
    
    public void imprimirProducto(){
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Producto: "+ key.toString()+" Precio: "+String.format("%.2f",val) + "$");
            
        }
    }
    
    public void modificarPrecio(){
        System.out.println("De que producto desea modificar el precio?");
        leer.nextLine();
        String producto2 = leer.nextLine().toLowerCase();
        System.out.println("Ingrese el nuevo precio: ");
        double precio2 = leer.nextDouble();
        
        if (productos.containsKey(producto2)) {
            productos.replace(producto2, precio2);
            
        }
        System.out.println("La nueva lista es: ");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Producto: " +key.toString()+ " Precio: "+ String.format("%.2f", val) + "$");
            
        }
    }

    public void eliminarProducto(){
        System.out.println("Que producto desea eliminar?");
        leer.nextLine();
        String producto3 = leer.nextLine().toLowerCase();
        
        productos.remove(producto3);
        
        System.out.println("El producto " +producto3+" ha sido eliminado");
    }
    
    public void crearMenu(){
        do {
          
             System.out.println("*********************************************");
            System.out.println("*******************TIENDA********************");
            System.out.println("*********************************************");

            System.out.println("Bienvenido al menu, digite su opcion: ");
            System.out.println("0- Crear productos y precios "
                    + "\n1- Mostrar los productos con sus precios "
                    + "\n2- Modificar el precio de un producto "
                    + "\n3- Eliminar un producto "
                    + "\n4- Salir ");

           option = leer.nextInt();
           
           switch (option){
               
               case 0:
                   crearProducto();
                   System.out.println("");
                   break;
                   
               case 1:
                   imprimirProducto();
                   System.out.println("");
                   break;
                   
               case 2:
                  modificarPrecio();
                  System.out.println("");
                  break;
                  
               case 3:
                  eliminarProducto();
                  System.out.println("");
                  break;
                  
               case 4:
                   System.out.println("Gracias por usar nuestro sistema :)");
                   System.out.println("");
                   break;
                   
               default:
                   System.out.println("Opcion no disponible");
                   System.out.println("");
           }
            
            
        } while (option != 4);
    }
}
