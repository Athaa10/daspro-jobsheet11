import java.util.Scanner;

public class CafeIbuMariana03Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] penjualan = new int[menu.length][7];

        System.out.println("=== Penjualan Kafe Ibu Mariana ===");
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }

        System.out.print("Masukkan nomor menu (1-5): ");
        int pilihanMenu = sc.nextInt() - 1;
        System.out.print("Masukkan nomor hari (1-7): ");
        int pilihanHari = sc.nextInt() - 1;

        if (pilihanMenu >= 0 && pilihanMenu < menu.length && pilihanHari >= 0 && pilihanHari < 7) {
            System.out.println("Penjualan " + menu[pilihanMenu] + " pada hari ke-" + (pilihanHari + 1) + ": " + penjualan[pilihanMenu][pilihanHari]);
        } else {
            System.out.println("Pilihan menu atau hari tidak valid.");
        }
    }
}