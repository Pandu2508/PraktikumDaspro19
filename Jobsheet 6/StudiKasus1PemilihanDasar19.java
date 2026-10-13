import java.util.Scanner;
public class StudiKasus1PemilihanDasar19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int hargaPerCup = 18000;
            int jumlahCup, uangBayar, diskon, totalHarga, totalBayar;
            System.out.print("Masukkan jumlah cup: ");
            jumlahCup = scanner.nextInt();
            System.out.print("Masukkan uang bayar: Rp");
            uangBayar = scanner.nextInt();

            totalHarga = hargaPerCup * jumlahCup;
            diskon = 0;
            if (totalHarga >= 100000) {
                diskon = totalHarga * 10 / 100;
            }
            totalBayar = totalHarga - diskon;
            System.out.println("Total harga: Rp" + totalHarga);
            System.out.println("Diskon: Rp" + diskon);
            System.out.println("Total bayar: Rp" + totalBayar);
            if (uangBayar >= totalBayar) {
                int kembalian = uangBayar - totalBayar;
                System.out.println("Kembalian: Rp" + kembalian);
            } else {
                int kurangBayar = totalBayar - uangBayar;
                System.out.println("Uang bayar tidak cukup kurang: Rp" + kurangBayar);
            }
        }
    }
}
