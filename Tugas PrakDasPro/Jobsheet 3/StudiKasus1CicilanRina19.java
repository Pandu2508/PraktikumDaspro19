import java.util.Scanner;
public class StudiKasus1CicilanRina19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaBarang, lamaCicilan, uangMuka;
        double bunga = 0.02 , cicilanPerBulan, sisaHarga, cicilanPokok, bungaPerBulan;

        System.out.print("Masukkan harga barang: ");
        hargaBarang = input.nextInt();
        System.out.print("Masukkan uang muka: ");
        uangMuka = input.nextInt();
        System.out.print("Masukkan lama cicilan (dalam bulan): ");
        lamaCicilan = input.nextInt();
        sisaHarga = hargaBarang - uangMuka;
        cicilanPokok = sisaHarga / lamaCicilan;
        bungaPerBulan = sisaHarga * bunga;
        input.close();
        cicilanPerBulan = cicilanPokok + bungaPerBulan;
        System.out.println("Jumlah cicilan per bulan adalah: " + cicilanPerBulan);
    }
}