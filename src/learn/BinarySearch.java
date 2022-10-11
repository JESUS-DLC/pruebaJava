/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.util.Arrays;

/**
 *
 * @author jesusdlc
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int[] array = new int[100];
         int target = 42;
         
         for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
         
         int index = Arrays.binarySearch(array, target);
        
         if(index == -1){
             System.out.println(target +" not found");
         }else{
             System.out.println("element "+target+" found at: "+target +" position");
         }
    }
    
}
