import java.util.Scanner;

public class tugas1DiskonBuku19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
            String jenisBuku = sc.nextLine().trim();
            System.out.print("Masukkan jumlah buku yang dibeli: ");
            int jumlahBuku = sc.nextInt();
            double diskon;
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = 0.10;
                if (jumlahBuku > 2) {
                    diskon += 0.02; 
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 0.07; 
                if (jumlahBuku > 3) {
                    diskon += 0.02; 
                } else {
                    diskon += 0.01; 
                }
            } else { 
                if (jumlahBuku > 3) {
                    diskon = 0.05; 
                } else {
                    diskon = 0.0; 
                }
            }
            System.out.println("Total Diskon yang didapat: " + (diskon * 100) + "%");
        }
    }
}
