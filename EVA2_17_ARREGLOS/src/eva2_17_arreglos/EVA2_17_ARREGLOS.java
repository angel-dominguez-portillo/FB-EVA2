/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_arreglos;

import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        int califa[];
        String nombres[];
        Scanner captu = new Scanner(System.in);
        System.out.print("Cuantas calificaciones ahí?");
        cantidad = captu.nextInt();
        captu.nextLine();
        califa = new int[cantidad];
        nombres = new String[cantidad];
        
        for(int i = 0; i < califa.length; i++){//leer todos los valores
            System.out.println("Nombre del estudiante #" + i);
            nombres[i] = captu.nextLine();
            
            System.out.println("Calificacion de estudiante #" + i);
            califa[i] = captu.nextInt();
            captu.nextLine();
        }
        //imprimimos las califa
        for(int i = 0; i < califa.length; i++){//leer todos los valores
            System.out.print(nombres[i] + ":" + califa[i] + "-");
        }
    }
    
}
