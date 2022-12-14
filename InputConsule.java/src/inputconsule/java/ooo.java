/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputconsule.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ooo {
     public static void main(String[] args) throws IOException {

        String nama, kelas, matkul;
        int nim;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        
        //membuat design
        System.out.println("===========================================");
        System.out.println("      Membuat data menggunakan buffer      ");
        System.out.println("===========================================");

        // Mengisi varibel nama dengan Bufferreader
        System.out.print("nama   : ");
        nama = br.readLine();
        System.out.print("kelas  : ");
        kelas = br.readLine();
        System.out.print("matkul : ");
        matkul = br.readLine();
        System.out.print("nim    : ");
        nim = br.read();

        // tampilkan output isi variabel nama
        System.out.println("===========================================");
        System.out.println("      Membuat data menggunakan buffer      ");
        System.out.println("===========================================");
        System.out.println("Nama   : " + nama);
        System.out.println("Nim    : " + nim);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Matkul : " + matkul);

    }

}
   
