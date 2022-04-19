/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
va a tener que contar con muchas personas y muchos perros. El programa deberá
preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
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
