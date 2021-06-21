package java_proje;
import java.util.Scanner;
public class ciftSayiToplam {
    public static void main(String[] args) {
        int sayi,toplam=0,k=0;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        for(int i = 1 ; i<=sayi;i++) {
            if(i%3==0 && i%4 == 0) {
                toplam+=i;
                k++;
            }
        }
        ort= toplam/k;
        System.out.println("Girilen sayıya kadar olan sayıların 3 ve 4 dörde tam bölünen sayıların ortalaması : " + ort);

    }
}
