/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LoopWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean run = true;
        int count =0;
        String jawab;
        
        Scanner scan = new Scanner(System.in);
        while(run) {
            System.out.println("apakah kamu jomblo?");
             System.out.print("jawab[ya/tidak])");
             jawab = scan .nextLine();
             
             if(jawab.equalsIgnoreCase("ya")){
                 run = false;
             }
            count++;
        }
    }
    
}
