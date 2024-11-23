import java.util.Scanner;
public class CafeIbuMariana03 {
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
        int[] totalHarian = new int[7];
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < menu.length; i++) {
                totalHarian[j] += penjualan[i][j];
            }
        }
        int[] totalMenu = new int[menu.length];
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < 7; j++) {
                totalMenu[i] += penjualan[i][j];
            }
        }
        int maxPenjualan = totalMenu[0];
        int menuTertinggi = 0;
        for (int i = 1; i < menu.length; i++) {
            if (totalMenu[i] > maxPenjualan) {
                maxPenjualan = totalMenu[i];
                menuTertinggi = i;
            }
        }
        double[] rataRataPerMenu = new double[menu.length];
        for (int i = 0; i < menu.length; i++) {
            rataRataPerMenu[i] = (double) totalMenu[i] / 7;
        }
        
        System.out.println("\n=== Hasil Penjualan ===");
        for (int j = 0; j < 7; j++) {
            System.out.println("Total penjualan hari ke-" + (j + 1) + ":" + totalHarian[j]);
        }
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Total penjualan " + menu[i] + ":" + totalMenu[i]);
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah " + menu[menuTertinggi] + 
                           " dengan total penjualan " + maxPenjualan);
        System.out.println("Rata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < menu.length; i++) {
        System.out.printf("%s : %.2f%n", menu[i], rataRataPerMenu[i]);
        }
    }
}