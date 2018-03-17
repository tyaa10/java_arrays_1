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
        
        int x = 10;
        int[] xArray = new int[5];
        xArray[0] = -3;
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
        
        int[][] tab = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tab[i][j] = i * j;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d\t", tab[i][j]);
            }
            System.out.println("");
        }
    }
    
}
