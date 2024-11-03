package codigo;
import java.util.Scanner;
public class Codigo {
    public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
     int A,E,T,P;
        System.out.println("Señor usuario dijite la cantidad de horas.");
        A = in.nextInt();
                if (A>40) {
                    System.out.println("Bono extra.");
                    E = A-40;
                    T = E*22000;
                            P =(A*17000)+ T;
                                   System.out.println("Señor usuario su saldo es:." +P); 
                }
                                   else {
                                   P = A*17000;
                                   System.out.println("Su saldo es:" +P);
                                           
                                   
                }
          
    }
    
}
