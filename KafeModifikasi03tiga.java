import java.util.Scanner;

public class KafeModifikasi03tiga {
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();        
        int totalHargaKeseluruhan = 0;        
        while (true) {
            System.out.print("Masukkan nomor menu (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();
            
            if (pilihanMenu == 0) {
                break; 
            }
            
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.nextLine();

            totalHargaKeseluruhan += hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        }
        System.out.println("Total keseluruhan pesanan: Rp" + totalHargaKeseluruhan);
        sc.close();
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7;
            System.out.println("Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid. Tidak ada pengurangan.");
        }        
        return hargaTotal;
    }
}