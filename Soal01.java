import java.util.Scanner;
public class Soal01 {
    public static void main(final String[] args) {
        Scanner userInput = new Scanner(System.in);
        int bil1 = userInput.nextInt();
        int bill2 = userInput.nextInt();
        int bill3 = userInput.nextInt();
        int bill4 = userInput.nextInt();
        int bill5 = userInput.nextInt();
        System.out.println(identifikasi(bil1));
        System.out.println(identifikasi(bill2));
        System.out.println(identifikasi(bill3));
        System.out.println(identifikasi(bill4));
        System.out.println(identifikasi(bill5));
    }

    public static String identifikasi(int bilangan) {
        int k1 = bilangan / 100;
        int k2 = bilangan / 10 % 10;
        int k3 = bilangan % 10;
        String valid = "";
        boolean cekSama = (k1 != k2) && (k2 != k3) && (k3 != k1);
        boolean cekBesar = (k1 < k2) && (k2 < k3);
        boolean cekGanjil = (k3 % 2) == 1;
        if (cekSama && cekBesar && cekGanjil) {
            valid = "valid";
        } else {
            valid = "tidak valid";
        }
        return String.format("%d %s", bilangan, valid);
	}
}
