/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabstraccion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal donde se ejecuta el programa.
 *
 * @author Wilson Pachon
 */
public class Main {

    /**
     * Arreglo para ir almacenando las naves que se crean.
     */
    public static ArrayList<String> ships = new ArrayList<>();

    /**
     * Metodo para crear las naves.
     *
     * @param option opcion seleccionada por el usuario.
     */
    public static void createShip(int option) {

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        System.out.print("\ningrese el nombre de la nave: ");
        String name = in.nextLine();
        System.out.print("ingrese la velocidad de la nave (km/h): ");
        float speed = in.nextFloat();
        System.out.print("ingrese el empuje de la nave: ");
        float push = in.nextFloat();
        System.out.print("ingrese combustible: ");
        String fuel = in2.nextLine();
        System.out.print("ingrese el peso de la nave: ");
        float weight = in.nextFloat();

        System.out.print("ingrese la cantidad de motores: ");
        int engines = in.nextInt();

        if (option == 1) {
            System.out.print("ingrese capacidad de carga util: ");
            int load = in.nextInt();

            ShuttleVehicles sv = new ShuttleVehicles(name, speed, push, fuel, weight, engines, load);

            ships.add(sv.toString());

        } else if (option == 2) {

            System.out.print("indique el objetivo de la mision: ");
            String mission = in2.nextLine();
            System.out.print("cual sera el lugar de lanzamiento: ");
            String launch = in2.nextLine();

            UnmannedSpacecraft unmanned = new UnmannedSpacecraft(name, speed, push, fuel, weight, engines);
            ships.add(unmanned.toString() + unmanned.setMissionObjective(mission) + unmanned.LaunchSite(launch));

        } else {
            System.out.print("capacidad de tripulantes: ");
            int crew = in.nextInt();
            System.out.print("distancia de orbitacion (kms): ");
            float dist = in.nextFloat();

            MannedSpacecraft manned = new MannedSpacecraft(name, speed, push, fuel, weight, engines);

            ships.add(manned.toString() + manned.setPeopleCapacity(crew) + manned.setOrbitDistance(dist));

        }

        System.out.println("\nNave creada con exito!");

    }

    /**
     *Metodo principal para la ejecucion del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t----CREACION DE NAVES----\n");
        Scanner in = new Scanner(System.in);
        boolean i = true;

        do {

            System.out.println("-------------------------------");
            System.out.println("\nQue tipo de nave desea crear?\n");
            System.out.println("1. Vehiculos Lanzadera.");
            System.out.println("2. Naves espaciales no tripuladas.");
            System.out.println("3. Naves espaciales tripuladas.");
            System.out.println("4. Salir del programa.\n");
            System.out.print("ingrese una opcion: ");

            int option = in.nextInt();
             
           
            switch (option) {
                case 1:
                    createShip(option);
                    break;
                case 2:
                    createShip(option);
                    break;
                case 3:
                    createShip(option);
                    break;
                case 4:
                    i = false;
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (i);

        System.out.println("\nNaves creadas\n");
        /**
         * lista las naves creadas.
         */
        for (String s : ships) {
            System.out.println(s + "\n");
        }
    }

}
