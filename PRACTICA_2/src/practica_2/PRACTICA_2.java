/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("numero 1: ");
        num2 = captu.nextInt();
        System.out.println("numero 2: ");
        num = captu.nextInt();
        for(int i = num2; i <= (num - 1); i++){
            System.out.println(i);
        }for(int o = num - 1; o >= (num2 + 1); o--){
            System.out.println(o);
        }
    }
}
