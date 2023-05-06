package ejercicio4;

/*
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el t�tulo, director y duraci�n de la pel�cula (en horas).
Implemente las clases y m�todos necesarios para esta situaci�n, teniendo en cuenta lo
que se pide a continuaci�n:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidi�ndole al usuario
todos sus datos y guard�ndolos en el objeto Pelicula.
Despu�s, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Despu�s de ese bucle realizaremos las siguientes acciones:

� Mostrar en pantalla todas las pel�culas.
� Mostrar en pantalla todas las pel�culas con una duraci�n mayor a 1 hora.
� Ordenar las pel�culas de acuerdo a su duraci�n (de mayor a menor) y mostrarlo en
pantalla.
� Ordenar las pel�culas de acuerdo a su duraci�n (de menor a mayor) y mostrarlo en
pantalla.
� Ordenar las pel�culas por t�tulo, alfab�ticamente y mostrarlo en pantalla.
� Ordenar las pel�culas por director, alfab�ticamente y mostrarlo en pantalla.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Vane Proa�o
 */
public class MovieService {

    Scanner read = new Scanner(System.in);
    ArrayList<Movie> movieList = new ArrayList<>();
    public int option;

    public void CreateMovie() {
        do {

            System.out.println("Ingrese el titulo de la pelicula: ");
            read.nextLine();
            String title = read.nextLine();
            System.out.println("Ingrese el nombre del Director: ");
            String director = read.nextLine();
            System.out.println("Ingrese la duracion en horas: ");
            double lenght = read.nextDouble();
            read.nextLine();
            System.out.println("Desea agregar otra pelicula? \nS/N");

            Movie newMovie = new Movie(title, director, lenght);
            movieList.add(newMovie);
        } while (read.next().equalsIgnoreCase("s"));

    }

    public void PrintMovieList(ArrayList ml) {
         for (Movie movie : movieList) {
            System.out.println(movie);
         }
    }

    public void PrintByDuration() {

        for (Movie aux : movieList) {
            if (aux.getDuration() > 1) {
                System.out.println(aux.toString());
            }
        }
    }

    public void SortDesc() {
        movieList.sort(Movie.Descending);
        for (Movie movie : movieList) {
            System.out.println(movie);
            
        }
    }

    public void SortAsc() {
        movieList.sort(Movie.Ascending);
          for (Movie movie : movieList) {
            System.out.println(movie);
    }
    }

    public void SortDescm() {
        movieList.sort(Movie.Descmovie);
          for (Movie movie : movieList) {
            System.out.println(movie);
          }
    }

    public void Alfamovie() {
        movieList.sort(Movie.Alfamovie);
          for (Movie movie : movieList) {
            System.out.println(movie);
          }
    }

    public void Menu() {
        do {
            System.out.println("*********************************************");
            System.out.println("*******************CINEMA********************");
            System.out.println("*********************************************");

            System.out.println("Bienvenido al menu, digite su opcion: ");
            System.out.println("0- Crear las peliculas "
                    + "\n1- Mostrar todas las peliculas "
                    + "\n2- Mostrar peliculas de duracion mayor a 1Hr "
                    + "\n3- Ordenar por duracion ascendente "
                    + "\n4- Ordenar por duracion descendente "
                    + "\n5- Ordenar alfabeticamente por titulo"
                    + "\n6- Ordenar alfabeticamente por director"
                    + "\n7- Salir ");

            option = read.nextInt();

            switch (option) {

                case 0:
                    CreateMovie();
                    System.out.println("");
                    break;
                case 1:
                    PrintMovieList(movieList);
                    System.out.println("");
                    break;
                case 2:
                    PrintByDuration();
                    System.out.println("");
                    break;
                case 3:
                    SortAsc();
                    System.out.println("");
                    break;
                case 4:
                    SortDesc();
                    System.out.println("");
                    break;
                case 5:
                    SortDescm();
                    System.out.println("");
                    break;
                case 6:
                    Alfamovie();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro sistema :)");
                     System.out.println("");
                    break;

                default:
                    System.out.println("Opcion no disponible.");
                    System.out.println("");
                    break;
            }

        } while (option != 7);

    }

}
