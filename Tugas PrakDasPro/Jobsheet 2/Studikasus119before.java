public class Studikasus119before {
    public static void main(String[] args) {
        int gaji_pokok, tunjangan_anak = 100000, jumlah_anak;
        double gaji_bersih, Potongan_pensiun = 0.1; // Contoh
        gaji_pokok = 5000000; // Contoh gaji pokok
        jumlah_anak = 4; // Contoh jumlah anak
        
        gaji_bersih = (int) (gaji_pokok - (gaji_pokok * Potongan_pensiun) + tunjangan_anak * jumlah_anak);
        System.out.println("Gaji Bersih: " + gaji_bersih);
    }
}
