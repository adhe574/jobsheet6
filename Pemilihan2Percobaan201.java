import java.util.Scanner;

public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double harga = 0, diskon = 0, total_bayar;

        System.out.println("-------------------------------");
        System.out.println("======== MENU KAFE JTI ========");
        System.out.println("-------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");

        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = Absen.nextInt();
        Absen.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        member = Absen.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("n"))
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
             } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
             }  else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
             } else {
                System.out.println("Member tidak valid");
             }

        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar = " + total_bayar);
        System.out.println("--------------------------------------");

             }
    }
