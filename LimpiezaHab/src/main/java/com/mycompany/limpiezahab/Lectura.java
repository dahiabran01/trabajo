/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package com.mycompany.limpiezahab;

/**
 *
 * @author dahiana.bran
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lectura {
    Scanner sc = new Scanner(System.in);

    public String leerString(String mensaje) {
        System.out.print(mensaje + ": ");
        return sc.nextLine();
    }

    public int leerInt(String mensaje) {
        System.out.print(mensaje + ": ");
        int entero = sc.nextInt();
        sc.nextLine(); 
        return entero;
    }

    public void cerrarScanner() {
        sc.close();
    }
}