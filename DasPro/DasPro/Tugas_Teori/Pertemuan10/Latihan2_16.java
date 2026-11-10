public class Latihan2_16 {
    public static void main(String[] args) {
    char huruf = 'a';
        int baris = 5;
    
        for (int i = 1; i <= baris; i++) {
            for (int s = 1; s <= baris - i; s++) {
                System.out.print(" ");
            }
            int jumlahHuruf = 2 * i - 1;
            for (int j = 1; j <= jumlahHuruf; j++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }
    }
}
