package ejercicio.pkg10;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int A,B,C,N,F,O;
        System.out.println("Señor usuario dijite tre numeros para saber cual es el mayor.");
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        if (A>B & A>C){
        N = A;
        System.out.println("Señor usuario el numero mayor es:" + N);
        }
        if (B>A & B>C){
        F = B; 
        System.out.println("Señor usuario el numero mayor es:" + F);
        }
        if (C>A & C>B) {
        O = C; 
        System.out.println("Señor usuario el numero mayor es:" + O);
        }
   
    } 
    
}
