package ejercicios;

import java.util.Scanner;

public class EscuelaIngles {
  public static void 10main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Declaro las variables.
    int edad;

    System.out.println("***** Bienvenido *****");
    System.out.println("Ingrese la edad de su hijo");
    edad = sc.nextInt();

    //Comienzo a armar el condicional multiple.

    if (edad >= 4 && edad <= 6){
      System.out.println("El horario del grupo Kinder es de: Lunes y Miercoles de 16 a 17hs.");
    }
    else{
      if (edad >=7 && edad <=8 ){
        System.out.println("El horario del grupo 1st Year es de: Martes y Jueves de 16:30 a 17:30hs");
      }
      else{
        if (edad >= 9 && edad <=10){
          System.out.println("El horario del grupo 2nd Year es de: Martes y Jueves 17:30 a 19hs");
        }
        else {
          if (edad >=11 && edad <=13){
            System.out.println("El horario del grupo 3rd Year es de: Lunes y Miercoles de 17 a 18:30hs");
          }
          else {
            System.out.println("Edad no correspondiente al rango de edades de la escuela.");
          }
        }
      }
    }
  }
}
