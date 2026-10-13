import java.util.Scanner;
public class laundryKiloan {
    public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)) {
        System.out.print("Masukkan jumlah kiloan laundry: ");
        double berat = input.nextDouble();
        int tarif;
        if (berat < 3){
            tarif = 7000;
        } else if (berat <=6){
            tarif = 6000;
        } else {
            tarif = 5000;
        }
        int totalBiaya = (int) (berat * tarif);
        System.out.print("Total harga laundry: Rp " + totalBiaya);
       }
    }
}