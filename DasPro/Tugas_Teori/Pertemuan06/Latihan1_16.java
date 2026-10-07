import java.util.Scanner;
public class Latihan1_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan 1: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan Bilangan 2: ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan Bilangan 3: ");
        int bil3 = input.nextInt();

        if (bil1 > bil2) {  
            if (bil1 > bil3) {
                System.out.println("bilangan terbesar = " + bil1);
            } else {
                System.out.println("bilangan terbesar = " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("bilangan terbesar = " + bil2);
            } else {
                System.out.println("bilangan terbesar = " + bil3);
            }
        }

        input.close();
    }
}