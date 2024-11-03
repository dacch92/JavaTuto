package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 { 
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int X,D;
        System.out.println("Señor usuario dijite el valor de su compra.");
        X = in.nextInt();
        if (X>100000) {
            System.out.println("Su descuento es del 20%.");
            D = (int) (X-(X*0.2));
    }
        else{
        D = X;    
        }
        System.out.println("Señor usuario su total a pagar es:" +D);
    } 
            
    
}
