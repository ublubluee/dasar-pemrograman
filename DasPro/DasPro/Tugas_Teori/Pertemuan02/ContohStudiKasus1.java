package Tugas_Teori.Pertemuan02;
import java.util.Scanner;

public class ContohStudiKasus1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

 int lebar;
 int panjang;
 int keliling;

 System.out.print("Masukkan lebar kebun: ");
 lebar = input.nextInt();
 
 System.out.print("Masukkan panjang kebun: ");
 panjang = input.nextInt();

 keliling = 2 * (lebar + panjang);
 System.out.println("Keliling kebun adalah: " + keliling);

input.close();
        }
    }

