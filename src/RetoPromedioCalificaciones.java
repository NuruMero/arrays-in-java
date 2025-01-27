import java.util.Scanner;

public class RetoPromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        var consola = new Scanner(System.in);

        System.out.print("Cuantas calificaciones deseas agregar?: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        var arreglo = new int[largoArreglo];
        var suma = 0;

        for (var i=0; i < largoArreglo; i++) {
            System.out.print("Calificacion["+i+"] = ");
            arreglo[i] = Integer.parseInt(consola.nextLine());
            suma += arreglo[i];
        }

        var promedio = suma / largoArreglo;
        System.out.println("Promedio de las Calificaciones: " +promedio);
    }
}
