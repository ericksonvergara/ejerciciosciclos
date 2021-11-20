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
        //int n2 = sc.nextInt();
        
        //int x = (n2 + (1 + n1));
        //int y = (n1 * 2);
        
         System.out.println(divisores(n1));
        //int r = (potencia(factorial(x),n1)/(potencia(y,factorial(n2))));
        //System.out.println(r);
        
         
     }  
     

        public static int divisores(int n){
       
        int sum_div=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum_div = sum_div+i;
            }            
        }
        return sum_div;
    }
}