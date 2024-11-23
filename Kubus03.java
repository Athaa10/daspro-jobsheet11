import java.util.Scanner;
public class Kubus03 {

    static int hitungLuasPermukaan (int s) {
        int LuasPermukaan= 6*s*s;
        return LuasPermukaan;
    }
    static int hitungVolume (int s) {
        int volume= s*s*s;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s,L,V;

        System.out.println("Masukkan sisi");
        s=sc.nextInt();

        L=hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan Kubus adalah "+L);
        V=hitungVolume(s);
        System.out.println("Volume Kubus adalah "+V);

    }
}