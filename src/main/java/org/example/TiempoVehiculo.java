package org.example;

import java.util.Scanner;

public class TiempoVehiculo {
    public double tiempoRecorrido(int opcion, double distancia) {
        double velocidadAuto = 100.0; //en kilometros/hora
        double velocidadMoto = 120.0;  //en kilometros/hora
        double velocidadBicicleta = 20.0;  //en kilometros/hora
        
        double tiempo = 0.0; // en horas

        if (opcion == 1) {
            tiempo = distancia / velocidadAuto;
        } else if (opcion == 2) {
            tiempo = distancia / velocidadMoto;
        } else if (opcion == 3) {
            tiempo = distancia / velocidadBicicleta;
        }

        return tiempo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TiempoVehiculo tiempoVehiculo = new TiempoVehiculo();

        do {
            System.out.println("Vamos a calcular el tiempo de distancia");
            System.out.println("Por favor, ingrese su nombre");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese su destino");
            String destino = scanner.nextLine();

            System.out.println("Ingrese la distancia");
            double distancia = scanner.nextDouble();

            System.out.println("Ahora escoja un vehículo para su viaje");
            System.out.println("1. Auto");
            System.out.println("2. Moto");
            System.out.println("3. Bicicleta");
            System.out.println("Escoja una opción");

            int opcion = scanner.nextInt();

            double tiempo = tiempoVehiculo.tiempoRecorrido(opcion, distancia);
            String vehiculo = getVehiculo(opcion);

            System.out.println("Hola " + nombre + ", el tiempo de viaje aproximado para llegar a " + destino + " en " + vehiculo + " es de: " + tiempo + " horas");

            System.out.println("¿Desea realizar otro cálculo? (Sí/No)");
            scanner.nextLine(); // Limpiar el buffer
            String decision = scanner.nextLine().toLowerCase();
            if (!decision.equals("si") && !decision.equals("sí")) {
                break;
            }
        } while (true);

        scanner.close();
    }

    private static String getVehiculo(int opcion) {
        if (opcion == 1) {
            return "auto";
        } else if (opcion == 2) {
            return "moto";
        } else if (opcion == 3) {
            return "bicicleta";
        }
        return "vehículo desconocido";
    }
}