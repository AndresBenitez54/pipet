
/**
 * Write a description of class Promedio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class precios
{
  public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numeroClientes;
       ComputadoresPOO[] losClientes = new ComputadoresPOO[50];
       String identificacion, nombre, computador;
       double costo;
       double promedio = 0;
       
       System.out.println("Digite el numero de clientes: ");
       numeroClientes = sc.nextInt();
       for(int i = 0; i < numeroClientes; i++){
           System.out.println("Digite la identificacion del cliente: ");
           identificacion = sc.next();
           System.out.println("Digite el nombre del cliente: ");
           nombre = sc.next();
           System.out.println("Digite el computador que compro el cliente : ");
           computador = sc.next();
           System.out.println("Digite el costo del computador : ");
           costo = sc.nextDouble();
           ComputadoresPOO unCliente = new ComputadoresPOO();
           unCliente.identificacion = identificacion;
           unCliente.nombre = nombre;
           unCliente.computador = computador;
           unCliente.costo = costo;
           losClientes[i] = unCliente;
        }
         for(int i = 0; i < numeroClientes; i++){
             promedio = promedio + (losClientes[i].costo / numeroClientes);
            }
            
            for(int i = 0; i < numeroClientes; i++){
             System.out.println("C.C: " +losClientes[i].identificacion);
             System.out.println("Nombres: "+ losClientes[i].nombre);
            System.out.println("Reparacion: "+ losClientes[i].computador);
            System.out.println("Costo: "+ losClientes[i].costo+"$");
            }
            
            System.out.println("El promedio general de ingresos es de: " + promedio+"$");
         }
}
