/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_uts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class inputbuffer {
    public static void main(String[] args) throws IOException{
        
        String nama, kelas, matkul;
        int nim;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("==============================================================");
        System.out.println("=   Membuat Data Karyawan Menggunakan Input BufferedReader   =");
        System.out.println("==============================================================");
        System.out.print("Nama   :");
        nama = br.readLine();
        System.out.print("Kelas  :");
        kelas = br.readLine();
        System.out.print("Usia   :");
        matkul = br.readLine(); 
        System.out.print("Nim    :");
        nim = br.read();       
        System.out.println("");
       
        System.out.println("==================================================");
        System.out.println("Membuat Data Diri Menggunakan Input BufferedReader");
        System.out.println("==================================================");
        System.out.println("Nama  :" + nama);
        System.out.println("Nim   :" + nim);
        System.out.println("Kelas :" + kelas);
        System.out.println("Matkul:" + matkul );
        
    }
}
