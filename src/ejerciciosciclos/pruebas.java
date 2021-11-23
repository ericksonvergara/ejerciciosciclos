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
        
        int  i = 10000;
        
        int veces=0;        
        boolean ok =true;                
        while(ok)
        {
         if(saber_narcisista(i))
         {
            System.out.println("el numero " + i + " es narcisista\n");
          veces--;
          
          
          if(veces>0)
             ok = false;
         }
          i--;
        }
        
    }

    public static boolean saber_narcisista(int i)
    {            
      int cc = String.valueOf(i).length();
      int aux = i;
      int acu = 0;
      
      while(i>0)
      {
        acu+= Math.pow(i%10, cc);
        i= i/10;
      }
      
      if(acu == aux)
       return true;
      else
       return false;
    } 
}
     
         

        
