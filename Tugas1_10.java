import java.util.Scanner;

public class Tugas1_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        for (int Outer = 1; Outer <= N; Outer++) {
            for (int inner = 1; inner <= N; inner++) {
                System.out.print(N);
            }
            System.out.println();
        }
    }
}
