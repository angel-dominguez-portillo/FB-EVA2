/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade;  
        int text = 0, num;
        Scanner captu = new Scanner(System.in);
        System.out.println("Escribe aquí: ");
        cade = captu.nextLine();
        num = cade.length();
        for(int i = 0; i <= num; i++){
            System.out.println(cade.charAt(text));
            text = text + 1;
        }
    }
}
