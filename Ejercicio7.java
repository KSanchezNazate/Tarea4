/*El programa debe mostrar un menú con una lista de películas y una opción para salir.

Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir.

Si el usuario elige salir, el programa mostrará un mensaje antes de salir. */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Elige una opción");
            System.out.println("1. La vida es bella");
            System.out.println("2. El padrino");
            System.out.println("3. El señor de los anillos");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La vida es bella");
                    System.out.println("No, señor, no. Yo no soy un héroe. Sólo soy un hombre común con unos ideales comunes. Y he hecho lo que he podido. Con lo poco que tenía. Con lo poco que sabía. Y, si he de morir, debo morir como un hombre que murió por sus ideales.");
                    break;
                case 2:
                    System.out.println("El padrino");
                    System.out.println("No me preguntes cómo sé que eres un hombre honrado, pero sé que lo eres. Y sé que no vas a matarme. Porque si lo haces, no serás un hombre honrado.");
                    break;
                case 3:
                    System.out.println("El señor de los anillos");
                    System.out.println("¡No es un adiós, es un hasta luego!");
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);
    }
}