/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_ciclos_arreglos;

import java.util.Arrays;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato, valores[];//un solo arreglo --> valores
        int[] datos, x, y, z;//todos som arreglos
        int[] arreglo = new int[20];
        
        for(int i = 0; i < arreglo.length; i++){//asignar valores
            arreglo[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i < arreglo.length; i++){//leer todos los valores
            System.out.print(arreglo[i] + " - ");   
        }
    }
    //System.out.println(Arrays.toString(arreglo)); SOLO IMPRIME LA DIRECCION EN MEMORIA DE LA PC
}//@ --> at --> EN
