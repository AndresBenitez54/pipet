
/**
 * Write a description of class Computadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Computadores
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] computadores = new String[50];
        double[] costos = new double[50];
        int numeroClientes;
        String identificacion, nombre, computador;
        double costo;
        double promedio = 0;

        System.out.println("Digite el número de clientes: ");
        numeroClientes = sc.nextInt();

        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("Digite la identificación del cliente: ");
            identificacion = sc.next();
            identificaciones[i] = identificacion;

            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            nombres[i] = nombre;

            System.out.println("Digite el computador que compro el cliente : ");
            computador = sc.next();
            computadores[i] = computador;
            
            System.out.println("Digite el costo del computador : ");
            costo = sc.nextDouble();
            costos[i] = costo;

        }

        for (int i = 0; i < numeroClientes; i++) {
            promedio += (costos[i]);
        }
        
        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("C.C: "+ identificaciones[i]);
            System.out.println("Nombres: "+ nombres[i]);
            System.out.println("Reparacion: "+ computadores[i]);
            System.out.println("Costo: "+ costos[i]+"$");
        }

        promedio /= numeroClientes;
        System.out.println("El promedio de ingresos es de: " + promedio+"$");
    }
}
