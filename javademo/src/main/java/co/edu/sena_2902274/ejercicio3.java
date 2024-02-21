package co.edu.sena_2902274;

import java.util.Scanner;

public class ejercicio3 {
      
    public static void main(String[] args) {
        
        //entradas 

        System.out.println("3. Número elevado al cuadrado ");

        System.out.println("Ingrese un número: ");

        Scanner src = new Scanner(System.in);

        double num11 = src.nextDouble();

        //proceso

        double resultnum11 = (num11*num11);

        //salida

        System.out.println("El número elevado al cuadrado es: " +resultnum11);

    }
}
