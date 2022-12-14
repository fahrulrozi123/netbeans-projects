/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemograman;

/**
 *
 * @author ACER
 */
public class Pemograman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, kelas, alamat;
        int nim, usia;
        double tb, bb;
        
        // mengisi variabel
        nama = "Fhahroul rozi";
        nim = 1955201186;
        kelas = "C1 informatika";
        alamat = "kp rawa lini RT 003/007 kec. Teluk naga kab. tangerang";
        usia = 20;
        tb = 168;
        bb = 50;
        
        //mencetak ke layar isi variabel
        System.out.println("Nama   : " + nama);
        System.out.println("Nim    : " + nim);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia   : " + usia + " tahung");
        System.out.println("Tinggi Badan : " + tb + " cm");
        System.out.println("Berat Badan  : " + bb + " kg");
    }
    
}
