/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.uts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputbufferedreader {
    public static void main(String[] args) throws IOException{
        
        String nama, kelas;
        int nim, usia;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("==================================================="  );
        System.out.println("Membuat Data Diri Menggunakan Object Bufferedreader"  );
        System.out.println("==================================================="  );
        System.out.print("Nama   :");
        nama = br.readLine();
        System.out.print("Nim    :");
        nim = br.read();
        System.out.print("Kelas  :");
        kelas = br.readLine();
        System.out.print("Usia   :");
        usia = br.read();
        
        System.out.println("Nama     :" + nama);
        System.out.println("Nim      :" + nim);
        System.out.println("Kelas    :" + kelas);
        System.out.println("Usia     :" + usia);
    }
    
}
