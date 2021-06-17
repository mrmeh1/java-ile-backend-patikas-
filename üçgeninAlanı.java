package Dersler;
import java.nio.file.LinkPermission;
import java.util.Scanner;
public class üçgeninAlanı {
    public static void main(String[] args) {
        int a,b,c;

        Scanner değişken = new Scanner(System.in);
        System.out.print("1.Kenar Uzunluğunu Giriniz: ");
        a = değişken.nextInt();
        System.out.print("2.Kenar Uzunluğunu Giriniz: ");
        b = değişken.nextInt();
        System.out.print("3.Kenar Uzunluğunu Giriniz: ");
        c = değişken.nextInt();
        int u =(a+b+c) / 2;
        int üçgeninCevresi = 2*u;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println("Üçgenin Çevresi: " + üçgeninCevresi);












    }
}
