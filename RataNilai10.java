import java.util.Scanner;

public class RataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, rataNilai;

        i = 1;
        while (1 <= 5) {
            System.out.println("Input Nilai Mahasiswa ke-" + 1);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("nilai ke-" + j + " = ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rerata Nilai Mahasiswa ke-" + i + " adalah " + rataNilai);
            i++;
        }

    }
}