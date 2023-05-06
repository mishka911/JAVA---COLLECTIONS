/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;


import java.util.Comparator;

/**
 *
 * @author Vane Proaño
 */
public class Pais {
    
    private String paises;

    public Pais() {
    }

    public Pais(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

 public static Comparator <Pais> orden = new Comparator<Pais>(){
   @Override
    public int compare(Pais p, Pais p1) {
        return p.getPaises().compareTo(p1.getPaises());
    }
         
         }; 

    @Override
    public String toString() {
        return "Pais{"+ paises + '}';
    }
      
    
    
    
    
}
