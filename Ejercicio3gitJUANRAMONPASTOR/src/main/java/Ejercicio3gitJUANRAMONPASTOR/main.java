/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3gitJUANRAMONPASTOR;
import java.util.*;
/**
 *
 * @author JuanRamónPastorSánch
 */
public class main {
    public static void mostrarPares(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número por teclado");
        int total = teclado.nextInt();
        int i;
        for (i=0;i>total;i++){
            if(i%2!=0){
                System.out.println("El numeroo par es: "+ i);
            }
        }
    }
}
