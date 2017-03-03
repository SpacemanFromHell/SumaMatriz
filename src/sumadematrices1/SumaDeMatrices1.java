/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadematrices1;

import java.util.Scanner;

/**
 *
 * @author srgab
 */
public class SumaDeMatrices1 {
        /**
     */
    public int tam1, tam2,tam3, tam4;//tamaño de matrices;
    public int i, j;//contadores    
    public int matrizA[][],matrizB[][],matrizC[][];   
    public void pideTamaño() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño #1 de la matriz A:  ");
        tam1 = leer.nextInt();
        System.out.println("Ingrese el tamaño #2 de la matriz A:  ");
        tam2 = leer.nextInt();        
        System.out.println("Ingrese el tamaño #1 de la matriz B:  ");
        tam3 = leer.nextInt();
        System.out.println("Ingrese el tamaño #2 de la matriz B:  ");
        tam4 = leer.nextInt();
    }public void pideDatos(){
        if(tam3==tam4){
            Scanner leer= new Scanner(System.in);
            System.out.println("Datos de la Matriz A: ");
            for (i=0; i<tam1; i++){
                for (j=0; j<tam2; j++){
                    System.out.print("Escribir valor " + i + " , " + j + ": ");
                    matrizA[i][j]= leer.nextInt();
                }
            }
            System.out.println("Datos de la Matriz B: ");
            for (i=0; i<tam3; i++){
                for (j=0; j<tam4; j++){
                    System.out.print("Escribir valor " + i + " , " + j + ": ");
                    matrizB[i][j]= leer.nextInt();
                }
            }    
        }else{
            System.out.println("El tamaño de las matrices son invalidas");             
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SumaDeMatrices1 sm = new SumaDeMatrices1();
        sm.pideTamaño();       
        sm.pideDatos();
    }
    
}
