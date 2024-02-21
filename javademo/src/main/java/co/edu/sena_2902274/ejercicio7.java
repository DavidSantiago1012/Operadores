package co.edu.sena_2902274;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        //entradas

        System.out.println("7.Calcular el promedio de 3 numeros");
        System.out.println("Ingrese el primer numero");

        Scanner src = new Scanner (System.in);
        Double Num1 =src.nextDouble();

        System.out.println("Ingrese el segundo numero");
        Double Num2 =src.nextDouble();

        System.out.println("Ingrese el tercer numero");
        Double Num3 =src.nextDouble();

        //proceso

        Double pro = (Num1+Num2+Num3)/3;

        //salida 

        System.out.println("El promedio de los numeros es " +pro);

    }
}
