/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;


import java.util.Date;
import javax.swing.JOptionPane;


public class Print {
    public static void main(String[ ] args) {
    String estado = (JOptionPane.showInputDialog(null,"Selecciona el estado del restaurante ",
                "Estado",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Selecciona","Abierto","Cerrado"},"Selecciona")).toString();
    
    Date fechaActual = new Date();
    
    Restaurant registro = new Restaurant("Mar&Terraneo", 2140465,"Calle Poeta 6, Malaga,ES","860075480");
       System.out.println(fechaActual);
       System.out.println(registro.nombre);
       System.out.println("Dir: "+registro.direccion);
       System.out.println("tel: "+registro.telefono);
       System.out.println("Nit: "+registro.id);
       System.out.println("Estado del local: " +estado);
      
     String type =   (JOptionPane.showInputDialog(null,"Seleccione tipo de usuario ",
                "Type",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Selecciona","Admin","Gerente","Mesero"},"Selecciona")).toString();
      
    
     
       
    }
 }
    