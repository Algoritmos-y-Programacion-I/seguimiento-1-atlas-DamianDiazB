/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final int COSTO_TRAYECTO_AVION = 250000;
    final int COSTO_HOTEL = 150000;
    final int COSTO_BUS = 80000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() {   

        // Declaracion de info a pedir del usuario (completar)
        String nombre, CiudadOrigen, cedula, tarjetaI;
        int edad, noches;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
        // Dar nombre del usuario y bienvenida
        System.out.println("Bienvenido " + nombre + "!");
        // Pedir edad del usuario
        System.out.println("Ahora, ¿Cual es tu edad?: ");
        edad = escaner.nextInt();
        //Pedir numero de documento dependiendo de si es mayor de edad o menor de edad
        if (edad >= 18) {
            System.out.println("Por favor, escribe tu numero de cedula (C.C.): ");
            cedula = escaner.nextLine();
            }
         else {
            System.out.println("Por favor, escribe tu numero de targeta de indentidad (T.I.): ");
            cedula = escaner.nextLine();
        }
        // Pedir Ciudad de origen
        System.out.println("¿De donde te comunicas?: ");
        CiudadOrigen = escaner.nextLine();
        // Pedir cuantas noches se va a quedar
        System.out.println("¿Cuantas noches vas a quedarte? (Maximo cuatro noches): ");
        noches = escaner.nextInt();

        
        // Declaracion de salidas calculadas (completar)
        int totalTransporte, totalHospedaje;
        totalTransporte = TotalViaje(2, COSTO_TRAYECTO_AVION);
        totalHospedaje = TotalHotel(noches, COSTO_HOTEL);

        System.out.println("Genial, la vas a pasar genial, que quedaras " + noches + "en Bogota y este es el resumen de tu compra: ");
        System.out.println("Tiquetes Avion" + CiudadOrigen + " - Bogota  - " + CiudadOrigen + ", por un total de $" + totalHospedaje);
        System.out.println("A nombre de: " + nombre);
        if (edad >= 18) {
            System.out.println("Poseedor de la cedula (C.C.): " + cedula);
            }
         else {
            System.out.println("Poseedor de la targeta de indentidad (T.I.): " + cedula);
        }
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}


    public static int TotalHotel(int a, int b){
        return (a*b);
    }

    public static int TotalViaje(int a, int b){
        return (a*b);
    }
}