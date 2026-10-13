import java.util.Scanner;

public class Tugas2Pemilihan19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("--- Cetak KRS ---");
            System.out.print("Masukan jumlah SKS : ");
            int jumlahSks = sc.nextInt();

            if (jumlahSks > 24) {
                System.out.println("Jumlah SKS melebihi batas maksimal");
            } else {
                System.out.println("Jumlah SKS valid");
            }
        }
    }
}
