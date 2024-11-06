/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_16_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miercoles",
        "Jueves", "Viernes", "Sabado"};
        
        //imprimir
        for(int i = 0; i < diasSemana.length; i++){//leer todos los valores
            System.out.println("El dia " + i + " es " + diasSemana[i]);
        }
    }
    
}
