/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, num2, y = 0;
   Scanner captu = new Scanner(System.in);
   while(true){
        System.out.println("Introduce un numero: ");
        num = captu.nextInt();
        if(num > y){
            y = (y - y) + num;
        }
        num2 = y;
        if(num < 0)
            break;
    }
   System.out.println("El mayor es: " + num2);
    }
    
}