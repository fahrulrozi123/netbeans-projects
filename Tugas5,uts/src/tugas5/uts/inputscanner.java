/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5.uts;
import java.util.Scanner;

public class inputscanner {
    public static void main(String[] args) {
        String nama, kelas, matkul;
        int nim;
        
        Scanner mahasiswa = new Scanner(System.in);
        
        System.out.println("+------------------------------------++");
        System.out.println("+           Data Mahasiswa            +");
        System.out.println("+-------------------------------------+");
        System.out.print("Nama      :");
        nama = mahasiswa.nextLine();
        System.out.print("Kelas     :");
        kelas = mahasiswa.nextLine();
        System.out.print("Matkul    :");
        matkul = mahasiswa.nextLine();
        System.out.print("Nim       :");
        nim = mahasiswa.nextInt();
        System.out.println();
        
        System.out.println("+------------------------------------++");
        System.out.println("+           Data Mahasiswa            +");
        System.out.println("+-------------------------------------+");
        System.out.println("Nama        :" + nama);
        System.out.println("Nim         :" + nim);
        System.out.println("Kelas       :" + kelas);
        System.out.println("Matkul      :" + matkul);
    }
}
