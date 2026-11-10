import java.util.Scanner;
public class Latihan3_16 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;

            for (int j = 1; j <= i; j++) {
                kuadrat += i;
            }

            total += kuadrat;

            System.out.print("n = " + i + " -> jumlah kuadrat = ");

            for (int k = 1; k <= i; k++) {
                System.out.print(k * k);

                if (k < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + total);

        input.close();
        }
    }
}