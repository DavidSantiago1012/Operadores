package co.edu.sena_2902274;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        // entradas 
        System.out.println("Hallar la longitud y área de una circunferencia");
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia");
        double Ra = scr.nextDouble();

        // proceso
        double LoC = (2*Math.PI*Ra);
        double ArC = (Math.PI*Math.pow(Ra,2));

        //resultado 

        System.out.println("La longitud del circulo inscrito es" +ArC);
        }

    }