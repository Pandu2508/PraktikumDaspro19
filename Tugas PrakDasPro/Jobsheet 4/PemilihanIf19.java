import java.util.Scanner;

public class PemilihanIf19 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            boolean uktLunas;
            System.out.println("--- Cetak KRS ---");
            System.out.print("Apakah UKT sudah lunas (True/False) : ");
            uktLunas = sc.nextBoolean();

            if (uktLunas) {
                System.out.println("Pembayaran UKT terverifikasi");
                System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
            } else {
                System.out.println("Silahkan Membayar UKT terlebih dahulu");
            }

        }
    }
}
