/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5.uts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputbuffer {
    public static void main(String[] args) throws IOException {
        String nama, alamat;
        int gaji;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("==============================================================");
        System.out.println("=   Membuat Data Karyawan Menggunakan Input BufferedReader   =");
        System.out.println("==============================================================");
        System.out.print("Nama      :");
        nama = br.readLine();
        System.out.print("Alamat    :");
        alamat = br.readLine();
        System.out.print("Gaji      :");
        gaji = br.read();
        System.out.println();
        
        System.out.println("==============================================================");
        System.out.println("=   Membuat Data Karyawan Menggunakan Input BufferedReader   =");
        System.out.println("==============================================================");
        System.out.println("Nama        :" + nama);
        System.out.println("Alamat      :" + alamat);
        System.out.println("Gaji RP>    :" + gaji);
       
    }
}
