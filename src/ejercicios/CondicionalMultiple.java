package ejercicios;

import java.util.Scanner;

public class CondicionalMultiple {
    public static void main(String[] args) {

        //Declaro el scanner.

        Scanner sc = new Scanner(System.in);

        int edad;

        //Conmienzo a realizar la condicional multiple.
        System.out.println("Ingrese su edad");

        edad = sc.nextInt();

        //Se puede colocar un IF dentro de otro If.

        if (edad > 18){ //si la edad es mayor a 18 manda ese mensaje.
            System.out.println("Felicidades es mayor de 18.");

            if (edad >40){
                // si es mayor a 40
                System.out.println("Eres generación X");

            } else{
                //menor a 40.
                System.out.println("eres milennial");
            }

        } else {
            if (edad == 18){
                System.out.println("Tienes 18 añis justos.");
            }
            else {
                System.out.println("No tienes 18 años, sorry.");
            }

        }


    }
}
