/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
*/
package ejercicio_ex_01;

import Servicios.Servicios;

/**
 *
 * @author Walter
 */
public class Ejercicio_Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa crea personas que pueden adoptar perros:");
        Servicios Serv = new Servicios();
        
        int cantPerro,cantPers;
        
        System.out.print("\nIngrese la cantidad de personas: ");
        cantPers=Serv.leer.nextInt();
        for(int i=0;i<cantPers;i++){
            System.out.println((i+1)+"º persona:");
            Serv.CrearPersona();
        }
        
        System.out.print("\nIngrese la cantidad de perros: ");
        cantPerro=Serv.leer.nextInt();
        for(int i=0;i<cantPerro;i++){
            System.out.println((i+1)+"º perro:");
            Serv.CrearPerro();
        }
        
        System.out.println("\nSe comenzará a adoptar perros.");
        for(int i=0;i<cantPers;i++){
            System.out.println("\nLa "+(i+1)+"º persona:");
            Serv.AdoptarPerro(i);
        }
        
        Serv.MostrarPersona();
        Serv.MostrarPerro();
    }
    
}
