package co.edu.sena_2902274;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        //entradas

        System.out.println("6.Calcular el area y volumen de un cilindro");
        System.out.println("Ingrese el radio de la base del cilindro");

        Scanner src = new Scanner (System.in);
        Double Ra =src.nextDouble();

        System.out.println("Ingrese la altura del cilindro");

        Double Al =src.nextDouble();

        //proceso

        Double are = 2* Math.PI *Ra* (Ra+Al);
        Double vol = Math.PI * Math.pow(Ra, 2) * Al;

        //salida 

        System.out.println("El area del cilindro es "  +are + " El volumen es " +vol);

    }
}
