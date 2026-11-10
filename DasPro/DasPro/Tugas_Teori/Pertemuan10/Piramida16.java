public class Piramida16 {
    public static void main(String[] args) {

        int n = 7; 
        
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - 1 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
