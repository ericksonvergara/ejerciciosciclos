/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author noskcire
 */
public class x {
    
    public static void main(String[] args) {
         
       
        int limite = 10000;
         
        
        for(int i=0;i<=limite;i++){
            if(esNumarcisista(i)){
                System.out.println(i + "\t");
               
            }
            
        }
    }
         
    private static boolean esNumarcisista(int num) {
        int numDigitos = numDigitos(num);
        int rdo = 0, resto = 0, aux = num;
        while(aux>0){
            resto = aux%10;
            rdo += Math.pow(resto, numDigitos);
            aux /= 10;
        }
        return rdo==num;
    }
 
    private static int numDigitos(int num){
        int digitos = 0;
        while(num>0){
            digitos++;
            num /= 10;
        }
        return digitos;
    }
    
}
