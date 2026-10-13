import java.util.Scanner;

public class Tugas1Pemilihan19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("--- Cetak KRS ---");
            System.out.print("Apakah UKT sudah lunas (True/False) : ");
            boolean uktLunas = sc.nextBoolean();

            String pesan = uktLunas
                    ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
                    : "Silahkan Membayar UKT terlebih dahulu";
            System.out.println(pesan);

        }
    }
}
