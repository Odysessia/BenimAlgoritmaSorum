package algoritmasorusu;

import java.util.Scanner;

public class BenimAlgoritmaSorum {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Metin girin:");
        String metin = scn.nextLine();
        metin = metin.toLowerCase();
        char[] dizi = new char[metin.length()];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = metin.charAt(i);
        }
        kacharf(dizi);

    }

    static void kacharf(char[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            int sayac = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                    dizi[j] = ' ';
                }
            }
            if (dizi[i] != ' ') {

                System.out.println(dizi[i] + "= " + sayac);
            }
        }
    }
}
