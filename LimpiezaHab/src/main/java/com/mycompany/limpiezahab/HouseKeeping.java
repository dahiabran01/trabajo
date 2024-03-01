/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.limpiezahab;

/**
 *
 * @author dahiana.bran
 */
public class HouseKeeping {

    static Lectura mu = new Lectura();
    static int id;
    static int roomNo;
    static String name;
    static String location;
    static int Totalrooms = 0;

    public static void CleanRoom() {
        name = mu.leerString("Por favor ingrese su nombre: ");
        id = mu.leerInt("Ingrese su id: ");
        location = mu.leerString("Ingrese el lugar de su puesto de trabajo: ");
        roomNo = mu.leerroomNo();
        imprimir("La empleada " + name + " identificada con el ID: " + id + " ha limpiado la habitacion " + roomNo + " y ha limpiado un total de " + Totalrooms);

        Totalrooms += roomNo;
    }

    public static void imprimir(String cadena) {
        System.out.println(cadena);
    }

    public static int leerroomNo() {
        int roomNo;
        do {
            roomNo = mu.leerInt("Ingrese el numero de habitacion que ha limpiado (1-100): ");

            if (roomNo < 1 || roomNo > 100) {
                System.out.println("Numero de habitacion no valido");
            }
        } while (roomNo < 1 || roomNo > 100);

        System.out.println("numero valido");
        return roomNo;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenida al sistema de limpieza de Habitaciones");

        while (true) {
            CleanRoom();

            System.out.print("¿Ha limpiado otra habitación? (Sí/No): ");
            String respuesta = mu.leerString("");

            if (respuesta.equalsIgnoreCase("no")) {
                break;
            } else if (!respuesta.equalsIgnoreCase("si")) {
                System.out.println("Respuesta no válida. Por favor, ingrese 'si' o 'no'.");
            }
        }

        mu.cerrarScanner();
    }
}