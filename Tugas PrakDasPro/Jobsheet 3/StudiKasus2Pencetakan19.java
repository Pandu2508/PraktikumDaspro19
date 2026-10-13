
import java.util.Scanner;

public class StudiKasus2Pencetakan19 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int lembar, biayaCetak = 500, biayaJilid = 5000, TotBiaya;

            System.out.print("Masukkan berapa lembar: ");
            lembar = input.nextInt();
            TotBiaya = lembar * biayaCetak + biayaJilid;
            System.out.println("Totalnya adalah: " + TotBiaya);
        }
    }
}
