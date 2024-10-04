import java.util.Scanner;

public class TokoBuku01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenis_buku;
        int jumlah_buku;
        double diskon;

        System.out.print("Masukkan Jenis Buku : ");
        jenis_buku = sc.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jumlah_buku = sc.nextInt();

        if (jenis_buku.equalsIgnoreCase("kamus")) {
            if (jumlah_buku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
        } else if (jenis_buku.equalsIgnoreCase("novel")) {
            if (jumlah_buku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlah_buku >= 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }

        System.out.println("Total Diskon Yang Anda Dapat Sebesar " + (diskon * 100) + "%");

    }
}