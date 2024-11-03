package ejercicio.pkg12;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int A,B,T,Y;
        System.out.println("Señor usuario Ingrese periodo de tiempo de trabajo(AÑOS)");
        A = in.nextInt();
        System.out.println("Señor usuario ingrese su sueldo.");
        Y = in.nextInt();
        if (A>10){
            System.out.println("Boniificacion +20%");
            T = (int) (Y+(0.20*Y));
        }
        if (A<=10 & A>=5);{
            System.out.println("Boniificacion +15%");
            T = (int) (A+(A*0.15));
        }
        if (A<=5 & A>=1);{
            System.out.println("Boniificacion +10%");
            T = (int) (A+(A*0.10));
         }
        if (A<=2 & A>=1);{
            System.out.println("Boniificacion  +7%");
            T = (int) (A+(A*0.07));
        }
        if (A<1);{
            System.out.println("Boniificacion  +5%");
            T = (int) (A+(A*0.07));
        }
        System.out.println("Señor usuario su sueldo es:" +T);
        }
    }
    

