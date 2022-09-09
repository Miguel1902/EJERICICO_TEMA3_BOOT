/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema3;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class ejercicio_tema_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //HACEMOS UN ARRAY
        String[] texto = {"hola1", "hola 2", "hola3", "hola4"};
        //BUCLE PARA MOSTRAR POR CONSOLA LOS DATOS DEL ARRAY
        for (int i = 0; i < texto.length; i++) {
            //HACEMOS UNA CONDICION QUE NOS DIJA SI ESTA VACIA O LLENA Y NOS LO MUESTRE
            System.out.println("la posicion " + i + " es " + texto[i]);
        }

    }

}
