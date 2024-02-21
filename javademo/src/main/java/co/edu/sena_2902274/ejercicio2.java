package co.edu.sena_2902274;

import java.util.Scanner;

public class ejercicio2 {
     public static void main(String[] args) {

        //entradas
        System.out.println("2.Ingresar dos números");
        System.out.println("Ingrese un número");
        
        Scanner src = new Scanner (System.in);
        int num1 = src.nextInt();

        System.out.println("Ingrese otro número");
        int num2 = src.nextInt();

        int resultnum = (num1 + num2);

        System.out.println("El resultado es: " +resultnum);

     }
}
