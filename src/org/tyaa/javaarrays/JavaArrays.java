/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaarrays;

/**
 *
 * @author student
 */
public class JavaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int x = 10;
        //int[] xArray = new int[5];
        //xArray[0] = -3;
        //System.out.println(xArray[0]);
        //System.out.println(xArray[1]);
        //System.out.println(xArray[10]);
        
        /*for (int i = 0; i < xArray.length; i++) {
            
            System.out.printf("i = %d; xArray[i] = %d\n", i, xArray[i]);
        }*/
        
        /*int i = 0;
        while (i < xArray.length) {            
            System.out.printf("i = %d; xArray[i] = %d\n", i, xArray[i]);
            i++;
        }*/
        
        /*int i = 0;
        do {            
            System.out.printf("i = %d; xArray[i] = %d\n", i, xArray[i]);
            i++;
        } while (i < xArray.length);*/
        
        /*for (int value : xArray) {
            
            System.out.printf("xArray[i] = %d\n", value);
        }*/
        
        //char[] c1 = new char[3];
        
        /*int[] i1 = new int[3];
        
        //System.out.println(i1[0]);
        
        i1[1] = 12;
        
        for (int i = 0; i < i1.length; i++) {
            
            System.out.println(i + " = " + i1[i]);
        }*/
        
        /*int[][] tab1 = new int[3][3];
        
        tab1[0][0] = 5;
        tab1[2][1] = -5;
        
        for (int i = 0; i < tab1.length; i++) {
            
            for (int j = 0; j < tab1[i].length; j++) {
                
                //System.out.print(tab1[i][j]);
                System.out.printf("%4d", tab1[i][j]);
            }
            System.out.println();
        }*/
        
        /*int[][] tab = new int[10][10];
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tab[i-1][j-1] = i * j;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", tab[i][j]);
            }
            System.out.println("");
        }*/
        
        //Добавить в двумерный массив
        //строку и колонку со значениями, которые перемножаются (1 - 10, 1 - 10)
        
        int[][] tab = new int[11][11];
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tab[i-1][j-1] = i * j;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", tab[i][j]);
            }
            System.out.println("");
        }
    }
    
}
