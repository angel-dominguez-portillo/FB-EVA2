/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {10, 50, 85, 73, 11, 25, 11, 5, 0, 6,};
        int valor, posi = -1;
        Scanner captu = new Scanner(System.in);
        System.out.print("Valor a busar; ");
        valor = captu.nextInt();
        for(int i = 0; i < datos.length; i++){//leer todos los valores
            if(valor == datos[i]){
                //regresar la posicion
                posi = i;
                //detener el ciclo
                break; 
            }
        }
        if (posi == -1)
    System.out.println("Valor no encontrado");
    else
    System.out.println("El Valor esta en la posicion: " + (posi + 1));
    }
    
    
}
