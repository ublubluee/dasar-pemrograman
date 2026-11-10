import java.util.Scanner;
public class Tugas2Pemilihan16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah SKS: ");
        int jumlahSKS = input.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("Melebihi Batas");
        } else {
            System.out.println("KRS Valid");
        }
    
    input.close();
    }
}
