/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_ciclos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //REPETICION DE INSTRUCCIONES
        //CICLOS O BUCLES
        //CICLO FOR
        Scanner captu = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){//i es una indice
            //++ ---> operador para sumar 1 unidad
            //-- ---> resta 1 unidad
            //+= ---> suma N al valor
            //-= ---> resta N al valoe
            //*- ---> multiplica por N
            // /- --->divide por N
            System.out.println(i + "-");
        }for(int i = 10; i >= 1; i--){//i se resta
            System.out.println(i + "-");
        }
    }   
}
