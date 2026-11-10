import java.util.Scanner;
public class HitungJamBelajar16 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int totalJam = 0;
        int jam;

        for (int i = 1; i <= 7; i++) {
            do {
                System.out.print("Masukkan jam belajar hari ke-" + i + ": ");
                jam = input.nextInt();
                if (jam > 10 || jam < 0) {
                    System.out.println("Input Tidak Valid.");
                }
            } while (jam > 10 || jam < 0);

            totalJam += jam;
        }
        
        System.out.println("Total jam belajar selama seminggu adalah: " + totalJam + " jam.");
        
        input.close();
    }
}