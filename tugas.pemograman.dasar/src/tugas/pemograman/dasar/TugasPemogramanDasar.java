/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pemograman.dasar;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TugasPemogramanDasar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variabel
        String nama, kelas, alamat, prodi;
        int nim, usia;
        double tb;
        float bb;
        
        // mengisi variabel
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Menghitung berat badan anda");
        System.out.println("=================================================");
        
        System.out.print("Nama anda : ");
        nama = keyboard.nextLine();        
        System.out.print("Nim          : ");
        nim = keyboard.nextInt();     
        System.out.print("kelas          : ");
        kelas = keyboard.nextLine();
        System.out.print("Prodi         : ");
        prodi = keyboard.nextLine();
        System.out.print("Alamat            : ");
        alamat = keyboard.nextLine();
        System.out.print("Usia           : ");
        usia = keyboard.nextInt();
        System.out.print("tinggi Badan   : ");
        tb = keyboard.nextInt();
        System.out.print("Berat Badan    : ");
        bb = keyboard.nextInt();
        System.out.println("");
                
        
        System.out.println("Data Mahasiswa Universitas Muhammadiyah Tangerang");
        System.out.println("=================================================");
        System.out.println("Nama Mahasiswa:" + nama);
        System.out.println("Nim           :" + nim);
        System.out.println("Kelas         :" + kelas);
        System.out.println("Prodi         :" + prodi);
        System.out.println("Alamat        :" + alamat);
        System.out.println("Usia          :" + usia + " tahun");
        System.out.println("Tinggi Badan  :" + tb + " cm");
        System.out.println("Berat Badan   :" + bb + " kg");
        
        
        
    }
    
}
