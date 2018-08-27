/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CalfinnandJake
 */
import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please choose a number from 1 - 4");
        
        int t = sc.nextInt();
        sc.nextLine();
        System.out.println("Please input a sentence");
        
        String s = sc.nextLine();
        
        if (t == 1){
            System.out.println(reverse(s));
        }
    }
    public static String reverse(String s) {

    final int pos = s.indexOf(' ');
    if (pos > -1) {
        return reverse(s.substring(pos + 1).trim()) + " " + s.substring(0, pos).trim();
    }

    return s;
}
}
