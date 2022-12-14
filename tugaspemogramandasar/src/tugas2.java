/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class tugas2 {
    public static void main(String[] args){
        //membuat variable
        String nama, kelas, prodi, alamat;
        int nim, usia;
        double tb;
        float bb;
        
        //mengisi variable
        nama = "Fhahroul Rozi";
        nim = 1955201186;
        kelas= "C1 Teknik Informatika";
        prodi = "Informatika";
        alamat = "Kp rawa lini";
        usia = 20;
        tb = 168.5;
        bb = (float) 55.5;
        
        //mencetak output
        System.out.println("Nama        :" + nama);
        System.out.println("Nim         :" + nim);
        System.out.println("Kelas       :" + kelas);
        System.out.println("Prodi       :" + prodi);
        System.out.println("alamat      :" + alamat);
        System.out.println("Usia        :" + usia + " tahun");
        System.out.println("Tinggi Badan        :" + tb + " cm");
        System.out.println("Berat Badan         :" + bb + " kg");
    }
    
}
