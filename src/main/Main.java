package main;

import model.Estadio;
import model.Universidad;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Estadio estadio = new Estadio();
        System.out.println("Ingrese el deporte que realizará en el estadio: ");
        estadio.setDeporteRealizar(sc.nextLine());
        System.out.println("Ingrese el nombre del equipo local: ");
        estadio.setEquipoLocal(sc.nextLine());
        System.out.println("Ingrese el aforo permitido: ");
        estadio.setCapacidad(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el nombre del estadio: ");
        estadio.setNombre(sc.nextLine());
        System.out.println(estadio.toString());
        estadio.crearInfo();


    // Instanciar un objeto de tipo Universidad
    // es Estatal, debe retornar si o no

        Universidad universidad = new Universidad();
        System.out.println("Ingrese la cantidad de carreras de la Universidad: ");
        universidad.setCantidadCarreras(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el nombre de la Universidad: ");
        universidad.setNombre(sc.nextLine());
        System.out.println("Ingrese la Capacidad de la Universidad: ");
        universidad.setCapacidad(sc.nextInt());
        sc.nextLine();
        universidad.setEstatal(true);
        System.out.println(universidad.toString());
        universidad.crearInfo();
    }
}
