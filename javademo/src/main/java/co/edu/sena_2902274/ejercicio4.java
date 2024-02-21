package co.edu.sena_2902274;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        //entradas 

        System.out.println("4.Ingrese el valor a convertir");
        System.out.println("Ingrese valor del euro");
        
        Scanner src = new Scanner (System.in);

        Double eur = src.nextDouble();

        //proceso

        double resultdol = (eur*1.082);

        //salida

        System.out.println("El valor ingresado en euros es igual a: " +resultdol);
    }
}
