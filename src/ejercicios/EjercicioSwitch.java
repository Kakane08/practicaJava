package ejercicios;

import java.util.Scanner;

public class EjercicioSwitch {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Declaración de variables.
    int dia;
    String nombreDia;

    System.out.println("Ingrese un número del 1 al 7.");
    dia = sc.nextInt(); //Entrada de valor por teclado.

    switch (dia){
      case 1: nombreDia = "Lunes";
      break;
      case 2: nombreDia = "Martes";
      break;
      case 3: nombreDia = "Miercoles";
      break;
      case 4: nombreDia = "Jueves";
      break;
      case 5: nombreDia = "Viernes";
      break;
      case 6: nombreDia = "Sabado";
      break;
      case 7: nombreDia = "Domingo";
      break;

      default: nombreDia = "Dia incorrecto";
    }

    System.out.println("El día de la semana es: " + nombreDia);


  }
}
