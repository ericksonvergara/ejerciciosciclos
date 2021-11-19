/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosciclos;

import java.util.Scanner;

/**
 *
 * @author noskcire
 */
public class pruebas {
     public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);       
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int x = (n2 + (1 + n1));
        int y = (n1 * 2);
        
        
        int r = (potencia(factorial(x),n1)/(potencia(y,factorial(n2))));
        System.out.println(r);
        
         
     }
     
     public static int potencia(int n1, int n2){
        
        int a = (int)Math.pow(n1, n2);
        return a;
    }
    
    public static int factorial(int n1){
        int fact = 1;
        while (n1 != 0){
            fact = fact * n1; n1--;
            
        }
        return fact;
        
    }
}