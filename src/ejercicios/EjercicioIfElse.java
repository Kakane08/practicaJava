package ejercicios;

import java.util.Scanner;

public class EjercicioIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.println("Ingrese su edad");

        edad = sc.nextInt();

        //Declaro la condición if - Else.

        if (edad >= 18){
            System.out.println("Felicidades eres mayor de edad");
        } else {
            System.out.println("no puede seguir, no es mayor de 18");
        }

        System.out.println("Fin de la condición.");
    }
}
