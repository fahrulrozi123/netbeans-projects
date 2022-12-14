/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class tugas4 {
    public static void main(String[] args){
        String nama, alamat;
        int usia, gaji;
        
        Scanner karyawan = new Scanner(System.in);
        
        System.out.println("Nama    : Fhahroul Rozi");
        System.out.println("Nim     : 1955201186");
        System.out.println("Kelas   : C1 T.Informatika");
        
        System.out.println("+------------------------------------++");
        System.out.println("+     Pendataan Karyawan PT.Mitsuba   +");
        System.out.println("+-------------------------------------+");
        System.out.print("Nama Karyawan   :");
        nama = karyawan.nextLine();
        System.out.print("alamat          :");
        alamat = karyawan.nextLine();
        System.out.print("usia            :");
        usia = karyawan.nextInt();
        System.out.print("gaji            :");
        gaji = karyawan.nextInt();
        
        System.out.println("+------------------------------------++");
        System.out.println("+     Pendataan Karyawan PT.Mitsuba   +");
        System.out.println("+-------------------------------------+");
        System.out.println("Nama Karyawan   :" + nama);
        System.out.println("Alamat          :" + alamat);
        System.out.println("Usia            :" + usia + " tahun");
        System.out.println("Gaji            :" + gaji);
    }
    
}
