/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String[] arg){
      
        /*Scanner entrada = new Scanner(System.in);
     double numeroAbs=-23.3;
    double ValorAbsoluto=Math.abs(numeroAbs);
    
        System.out.println("Ingrese Un numero ");
        
        
        System.out.println("El valor positivo de "+numeroAbs+"es :"+ValorAbsoluto);*/
        
       Scanner entradas = new Scanner(System.in); 
        int numero1;
        int numero2;
     
        int NumeroPositivo = 0;
        int NumeroNegativo = 0;
 

        
         System.out.println("IntroduzcaPrimer numero:");
        numero1 = entradas.nextInt();

        System.out.println("IntroduzcaSegundo numero");
        numero2 = entradas.nextInt();

     

        int[] arreglo = new int[2];
        arreglo[0] = numero1;
        arreglo[1] = numero2;
       
      
        for (int a = 0;  a < arreglo.length; a++){

            if (arreglo[a] < 0) {
                NumeroNegativo++;
//               
            } else if (arreglo[a] > 0) {
                NumeroPositivo++;
//               
            
        }
        
         if(NumeroNegativo > 0) {
            System.out.println("La cantidad de numeros negativos es " + NumeroNegativo);       
        }      
          if(NumeroPositivo>0){
        System.out.println("La cantidad de numeros positivos es " +NumeroPositivo);
     }
    
    }
    }
}
