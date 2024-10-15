/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es tu base: ");
        num1 = captu.nextInt();
        System.out.println("Cual es tu segunda base: ");
        num2 = captu.nextInt();
        for(int i = num1; i <= num2; i++){
            int modulo = i % 2;//residuo de la divicion
            if(modulo != 0)//verdad --> sea impar, para detener la imprecion
                continue;
            System.out.print( i + " - ");
        }            
        System.out.println("");
        for(int i = num1; i <= num2; i++){
            int modulo = i % 2;//residuo de la divicion
            if(modulo == 0)//verdad --> sea impar, para detener la imprecion
                continue;
            System.out.print( i + " - ");
        }
    }
    
}
