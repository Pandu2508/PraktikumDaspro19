import java.util.Scanner;
public class MenghitungTotalBayar19 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double harga, potongan, jml_bayar, diskon = 0.15;
            
            System.out.print("Masukan harga barang: ");
            harga = input.nextDouble();

            potongan = harga * diskon;
            jml_bayar = harga - potongan;
            System.out.println("Jumlah yang harus dibayar: " + jml_bayar);
        }
    }
}

