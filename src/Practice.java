/* QUIAMBAO, CALVIN M.
 * CS-203
 * 2IT-B
 * LAB EXERCISE 0
 */
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        
        int x;
        System.out.println("Calvin Quiambao");
        System.out.println("Input a positive integer: ");
        long start = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Number input: "+i);
        
        for(x=1; x<=i; x++){
            System.out.format("%2d ",x);
        }
        
        System.out.println();
        long diff = System.nanoTime() - start;
        System.out.println("Multiplication Table: ");
            for (int a=1;a<x;a++){
            for (int j=1;j<x;j++)
               System.out.format("%2d ",a*j);
            System.out.println(); 
           }
         System.out.println("Elapsed Time: "+diff/1000000+" milliseconds");
    }
}
