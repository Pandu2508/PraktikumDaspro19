import java.util.Scanner;
public class StudiKasus1PemilihanDasar19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int hargaPerCup = 18000;
            int jumlahCup, uangBayar, diskon, totalHarga, totalBayar;
            System.out.print("Masukkan jumlah cup: ");
            jumlahCup = scanner.nextInt();
            System.out.print("Masukkan uang bayar: ");
            uangBayar = scanner.nextInt();

            totalHarga = hargaPerCup * jumlahCup;
            diskon = 0;
            if (totalHarga >= 100000) {
                diskon = totalHarga * 10 / 100;
            }
            totalBayar = totalHarga - diskon;
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: " + totalBayar);
            
        }
    }
}
