import java.util.Scanner;
public class Studikasus119 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int gaji_bersih, gaji_pokok, jumlah_anak;
            int tunjangan_anak = 100000;

            System.out.print("Masukkan gaji pokok: ");
            gaji_pokok = input.nextInt();
            System.out.print("Masukkan jumlah anak: ");
            jumlah_anak = input.nextInt();

            gaji_bersih = (int) (gaji_pokok - (gaji_pokok * 0.1) + tunjangan_anak * jumlah_anak);
            System.out.println("Gaji Bersih: " + gaji_bersih);
        }
    }
}
