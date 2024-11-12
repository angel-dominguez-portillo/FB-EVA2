/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_PROMEDIO{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa, sumaCal;
        //inicio del acumulador
        Scanner captu = new Scanner(System.in);
        sumaCal = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Estudiante = " + i);
            System.out.println("Cual es tu calificacion?");
            califa = captu.nextInt();
            captu.nextLine();
            //acumulacion de califas
            sumaCal = sumaCal + califa;
        }
        //sacar el promedio
        //divisiones enJAVA --> si dividimos enteros
        double promedio = sumaCal / 10.0;
    System.out.println("sumaCalifa = " + sumaCal);//sumatoria
    System.out.println("promedio de los estudiantes = " + promedio);//promediar
    }
    
}
