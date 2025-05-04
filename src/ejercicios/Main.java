package ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creo el scanner.
        Scanner sc = new Scanner(System.in);

        //Hago la declaración de las variables.
        int nun1, num2, suma;

        //Pido los números al usuario.
        System.out.println("Introduce el primer número: ");
        nun1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();


        //Realizo la suma.
        suma = nun1 + num2;
        //Muestro el resultado.
        System.out.println("La suma de " + nun1 + " y " + num2 + " es: " + suma);


    }
}