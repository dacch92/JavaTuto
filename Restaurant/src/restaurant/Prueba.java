/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

import java.util.Scanner;

/**
 *
 * @author DACCH
 */
    public class Prueba{

    public static void Prueba(){
        char digito; 
        boolean seguir;
        seguir = true;

        while (seguir){
            Scanner leer = new Scanner(System.in);
            digito = leer.next().charAt(0);

            if (digito=='a') {
                System.out.println("Caja abierta");
                seguir = false;
                }
            else if (digito=='c'){
                System.out.println("Caja Cerrada");
                seguir = false;
                }
            else {
                System.out.println("Error... Solo estados (a) y (c)... Intente nuevamente!!!");
                }
        }
    }
    }
        
    