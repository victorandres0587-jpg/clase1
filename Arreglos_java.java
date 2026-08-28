/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos_java;

/**
 *
 * @author ESTUDIANTES
 */
public class Arreglos_java {

    public static void main(String[] args) {
        int [] numeros = {10, 20, 30, 40, 50,};
        numeros [0]=202;
        
        for (int pepapig = 0; pepapig < numeros.length;pepapig++)
             System.out.println("posicion" + pepapig + ":" + numeros);
        //numeros.length
        System.out.println("recorrido con for - each:");
                for (int num : numeros){
                    System.out.println(num);
                }
        System.out.println(numeros.length);
        System.out.println( "el arrelgo inicio en :"+numeros[0]);
          System.out.println(numeros[0]);
        int [][]matriz ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
         for (int fila = 0 ;fila< matriz.length; fila++){
             int sumafila =0;
             for (int columna = 0 ; columna < matriz[fila].length; columna++){
                 sumafila += matriz[fila][columna];
             
             }
             System.out.println("suma fila" + fila +"" +sumafila);
         }
         
            for (int columna = 0 ;columna< matriz.length; columna++){
             int sumacolumna =0;
             for (int fila = 0 ; fila < matriz[fila].length; columna++){
                 sumacolumna += matriz[fila][columna];
             
             }
             System.out.println("suma columna" + columna +""+ sumacolumna);
         }
         
         System.out.println(matriz[1] [1]);
          for (int i = 0 ; i< matriz.length; i++){
              for (int j =0; j<matriz[i].length;  j++){
                    System.out.println(matriz[i] [j] +"");
              }
              
          }
          
          int sumadiagonal =0;
          for (int i =0;i<matriz.length;i++){
              sumadiagonal += matriz[i][i];
              
          }
          System.out.println("suma diagonal" + sumadiagonal);
    }
}