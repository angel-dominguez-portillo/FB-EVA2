/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_5;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PRACTICA_5 {

    public static void main(String[] args) {
            int num;
            String acum;
            Scanner captu = new Scanner(System.in);
            System.out.println("Cual es el numero de la cola: ");
            num = captu.nextInt();
            acum = "";
            for (int i = 1; i <= num; i++){
                acum = acum + "*";
                System.out.println(acum);
                }
             
    }
}
