import java.util.Scanner;

public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        String member, metodePembayaran, menu;
        double harga = 0, diskon = 0, total_bayar;
        int POTONGAN_QRIS = 0;

        System.out.println("-------------------------------");
        System.out.println("======== MENU KAFE JTI ========");
        System.out.println("-------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");

        System.out.print("masukkan angka dari menu yang dipilih = ");
        menu = input01.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        member = input01.nextLine();
        System.out.print("Pilih jenis pembayaran(Tunai/QRIS) = ");
        metodePembayaran = input01.nextLine();
        System.out.println("--------------------------------------");

        if (!(menu.equalsIgnoreCase("1") || menu.equalsIgnoreCase("2") || menu.equalsIgnoreCase("3"))) {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        if (menu.equalsIgnoreCase("1")) {
            harga = 14000;
            System.out.println("Harga RiceBowl = " + harga);
        } else if (menu.equalsIgnoreCase("2")) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        } else if (menu.equalsIgnoreCase("3")) {
            harga = 15000;
            System.out.println("Harga Paket Bundling = " + harga);
        }

        if (member.equalsIgnoreCase("y")) {
        
        } else if (member.equalsIgnoreCase("n")) {
            diskon = 0;
        } else {
            System.out.println("Status member tidak valid");
            return;
        }

        double subtotal = harga - (harga * diskon);

        if (metodePembayaran.equalsIgnoreCase("QRIS")) {
            POTONGAN_QRIS = 1000;
            System.out.println("Potongan pembayaran QRIS = Rp.1.000");   
        } else if (metodePembayaran.equalsIgnoreCase("Tunai")) {
            POTONGAN_QRIS = 0;
        }  else {
            System.out.println("Jenis pembayaran tidak valid");
            return;
        }

        total_bayar = subtotal - POTONGAN_QRIS ;
        System.out.println("Total bayar = " + total_bayar);
        System.out.println("-------------------------------");
    }
}