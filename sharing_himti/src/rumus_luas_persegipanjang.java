
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class rumus_luas_persegipanjang {
    public static void main(String[] args){
        int panjang, lebar, tinggi, luas;
       
       Scanner himti = new Scanner(System.in);
       
       System.out.println("CONTOH ARITMATIKA");
       System.out.println("=================");
       System.out.println("BY    : FHAHROUL ROZI");
       System.out.println("NIM   : 1955201186");
       System.out.println("KELAS : C1 Teknik Informatika");
       System.out.println("");       
       System.out.print("Masukan Panjang :");
       panjang = himti.nextInt();
       System.out.print("Masukan lebar   :");
       lebar = himti.nextInt();
       System.out.print("Masukan tinggi  :");
       tinggi = himti.nextInt();     
       
       luas = panjang*lebar*tinggi;
       
       System.out.println("Hasil adalaaaah :" + luas);
       
    }
    
}
  
   
