/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputconsule.java;
import java.io.Console;

public class inputConsul {
    public static void main(String[]args ){
        String nama;
        int usia;

        
        Console con = System.console();

        
        System.out.print("Inputkan nama: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: ");
        usia = Integer.parseInt(con.readLine());

        
        
        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Saat ini berusia " + usia + " tahun"); 
  }
    
}
    
