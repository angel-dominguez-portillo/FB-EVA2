/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base, expo;
        //inicio del acumulador
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es tu base: ");
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("Cual es tu exponenre: ");
        expo = captu.nextInt();
        captu.nextLine();
        int resu = 1;//esta acumula mis multiplicacion
        for(int i = 1; i<= expo; i++){
                resu = resu * base;
        }
        System.out.println("Tu resultado es = "+ resu);
    }
}
