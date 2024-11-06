/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_validad_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_VALIDAD_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        while(true){
        System.out.println("Numero del dia del 1 al 7: ");
        dia = captu.nextInt();
        if (dia >= 1 && dia <= 7)
        break;
        }
        switch(dia){
            case 1: 
                System.out.println("Lunes");
                break;//Utiliza instruccion - FIN DEL CASO 
            case 2: 
                System.out.println("Martes");
                break; 
            case 3: 
                System.out.println("Miercoles");
                break; 
            case 4: 
                System.out.println("Jueves");
                break; 
            case 5: 
                System.out.println("Viernes");
                break; 
            case 6: 
                System.out.println("Sabado");
                break;
            case 7: 
                System.out.println("Domingo");
                break; 
        }
    }
    }
    
