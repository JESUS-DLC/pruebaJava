/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.util.LinkedList;

/**
 *
 * @author jesusdlc
 */
public class Learn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         LinkedList<String> linkedList = new LinkedList<>();
         linkedList.offer("Strange");
         linkedList.offer("man");
         linkedList.offer("capitan");
         
         linkedList.poll();
         
         System.out.println(linkedList.peek());
    }
    
}
