package co.edu.sena_2902274;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        //entradas

        System.out.println("5.Calcular el area y el perimetro de un cuadrado");
        System.out.println("Ingrese el valor de un lado del cuadrado");

        Scanner src = new Scanner (System.in);
        Double La =src.nextDouble();

        //proceso

        Double ar = La*La;
        Double per = La+La+La+La;

        //salida 

        System.out.println("El area del cuadrado es "  +ar + " El perimetro es " +per);

    
    }
    
}
