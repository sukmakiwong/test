/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MainBarang {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Barang>arrBar = new ArrayList<>();
        arrBar.add(new Barang("1","A", 3000));
        arrBar.add(new Barang("2","B", 5000));
        arrBar.add(new Barang("3","C", 9000));
       
        
        for(int i=0;i<arrBar.size(); i++){
            System.out.println("Nama Barang \t: "+arrBar.get(i).getNama());
            System.out.println("Harga Barang \t: Rp"+arrBar.get(i).getHarga());
            System.out.println("");
    }
    }
    
}
