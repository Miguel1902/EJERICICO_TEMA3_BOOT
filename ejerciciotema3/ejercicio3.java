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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        String tex1 = "vacio";
        String var1 = "";
        while (!tex1.equals("")) {
            System.out.println("introduce un texto: ");
            tex1 = entrada.nextLine();
            var1 += tex1 + " ";
            System.out.println(var1);

        }
    }

}
