
import java.util.Scanner;

public class rumus_persegipanjang {
    public static void main(String[] args){
       int sisi, sisi2, luas;
       
       Scanner himti = new Scanner(System.in);
       
       System.out.println("CONTOH ARITMATIKA");
       System.out.println("=================");
       System.out.println("BY    : FHAHROUL ROZI");
       System.out.println("NIM   : 1955201186");
       System.out.println("KELAS : C1 Teknik Informatika");
       System.out.println("");       
       System.out.print("Masukan Nilai a :");
       sisi = himti.nextInt();
       System.out.print("Masukan Nilai b :");
       sisi2 = himti.nextInt();
       
       luas = sisi*sisi2;
       
       System.out.println("Hasil dari sisi dikali sisi :" + luas);
       
    }
    
}
