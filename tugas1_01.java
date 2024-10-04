import java.util.Scanner;

public class tugas1_01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int bil1, bil2, bil3, max;
        Scanner input = new Scanner(System.in);
        

        System.out.println("Program Mencari Nilai Maksimum");
        System.out.print("Masukkan bilangan pertama: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = input.nextInt();
        
        max = bil1;  
        if (bil2 > max) {
            max = bil2;
        }
        if (bil3 > max) {
            max = bil3;
        }
        System.out.println("Bilangan Terbesar: " + max);
        input.close();

    }
}