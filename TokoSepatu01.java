import java.util.Scanner;

public class TokoSepatu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merk_sepatu, kategori;
        int ukuran = 0, harga = 0;

        System.out.print("Masukkan Merk Sepatu : ");
        merk_sepatu = sc.nextLine();

        if (merk_sepatu.equalsIgnoreCase("converse")) {
            System.out.print("Pilih Kategori (Slip On atau High Top) : ");
            kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("slip on")) {
                System.out.print("Masukkan Ukuran Sepatu (36-40) : ");
                ukuran = sc.nextInt();
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("high top")) {
                System.out.print("Masukkan Ukuran Sepatu (40-44) : ");
                ukuran = sc.nextInt();
                harga = 1200000;
            } else {
                System.out.println("Kategori tidak valid!");
                return;
            }

        } else if (merk_sepatu.equalsIgnoreCase("sketcher")) {
            System.out.print("Pilih Kategori (Woman atau Man) : ");
            kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("woman")) {
                System.out.print("Masukkan Ukuran Sepatu (36-41) : ");
                ukuran = sc.nextInt();
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("man")) {
                System.out.print("Masukkan Ukuran Sepatu (41-44) : ");
                ukuran = sc.nextInt();
                harga = 1800000;
            } else {
                System.out.println("Kategori tidak valid!");
                return;
            }

        } else if (merk_sepatu.equalsIgnoreCase("nike")) {
            System.out.print("Pilih Kategori (Kids atau Adult) : ");
            kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("kids")) {
                System.out.print("Masukkan Ukuran Sepatu (36-40) : ");
                ukuran = sc.nextInt();
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("adult")) {
                System.out.print("Masukkan Ukuran Sepatu (40-44) : ");
                ukuran = sc.nextInt();
                harga = 1500000;
            } else {
                System.out.println("Kategori tidak valid!");
                return;
            }

        } else {
            System.out.println("Merk sepatu tidak tersedia!");
            return;
        }

        System.out.println("Anda Ingin Membeli Sepatu " + merk_sepatu);
        System.out.println("Dengan Ukuran " + ukuran);
        System.out.println("Dengan Harga Rp." + harga);
    }
}