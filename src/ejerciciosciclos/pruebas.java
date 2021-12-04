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

        int n = sc.nextInt();

        System.out.println(verificar(n));

        //for(int k=calcular(n)-1; k>=0; k--){
        //  System.out.println(k);
        //}
        //System.out.println(calcular(n));
    }

    public static int verificar(int n) {
        int num = String.valueOf(n).length();
        if (num == 6) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
            return num;
    }
/*
    public static int calcular(int n) {

        int i = 0;
        int[] vector;
        vector = new int[3];
        while (n == 6) {
            vector[i] = n % 100;
            n = n / 100;
            i++;
        }

        return i;
    }
*/
}
