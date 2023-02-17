/*El programa debe mostrar un menú con una lista de películas y una opción para salir.

Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir.

Si el usuario elige salir, el programa mostrará un mensaje antes de salir. */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("1. El padrino");
        System.out.println("2. Gladiador (2000)");
        System.out.println("3. El Rey León (1994)");
        System.out.println("4. Salir");
        System.out.println("Elige una opción");
        opcion = sc.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    System.out.println("Just when I thought I was out, they pull me back in.");
                    break;
                case 2:
                    System.out.println("La muerte nos sonríe a todos, devolvámosle la sonrisa.");
                    break;
                case 3:
                    System.out.println("Oh, sí... El pasado puede doler, pero tal como yo lo veo puedes huir de él o aprender.");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.println("1. El padrino");
            System.out.println("2. Gladiador (2000)");
            System.out.println("3. El Rey León (1994)");
            System.out.println("4. Salir");
            System.out.println("Elige una opción");
            opcion = sc.nextInt();
        }
        System.out.println("Hasta luego Lucas");
    }
}
