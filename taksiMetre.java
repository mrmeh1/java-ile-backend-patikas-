package Dersler;
import java.util.Scanner;
public class taksiMetre {
    public static void main(String[] args) {
        int km;
        double kmBaşına=2.20, total, start=10;

        Scanner ücret=new Scanner(System.in);
        System.out.print("Alınan Mesafeyi Km Olarak Giriniz: ");
        km=ücret.nextInt();

        total = km * kmBaşına;
        total += start;

        total = (total<20) ? 20: total;
        System.out.println("Toplam Tutar: " + total);

    }
}
