/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceAlumno {

    ArrayList<Alumno> student = new ArrayList();
    ArrayList<Integer> notas = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void crearAlumno() {
        int p = 0;

        do {
            System.out.println("Ingrese el nombre del alumno");
            student.add(new Alumno(leer.next()));

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota[" + (i + 1) + "]: ");
                notas.add(leer.nextInt());

            }
            student.get(p).setNotas(notas);
            System.out.println("Desea ingresa otro estudiante? S/N");
            p++;

        } while (leer.next().toLowerCase().equals("s"));

    }

    public void notaFinal(int p) {
        double promedio = 0;
        for (int i = 0; i < 3; i++) {
            promedio += student.get(p).getNotas().get(i);
        }
        System.out.println("la nota final es: " + String.format("%.2f",promedio / 3));

    }

    public void buscarAlumno() {
        System.out.println("Que nombre desea buscar?");
        String name = leer.next();
        
        int p = 0;

        for (Alumno alumno : student) {
            if (alumno.getNombre().equals(name)) {
                System.out.println("encontrado");
                notaFinal(p);
            }
            p++;
        }

    }
    

}
