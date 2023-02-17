/*El programa debe hacer que el usuario escriba un múltiplo de 3 y no se detenga hasta que el número sea correcto.*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Escribe un múltiplo de 3");
            numero = scanner.nextInt();
        } while (numero % 3 != 0);
        System.out.println("El número es correcto");
    }
}



