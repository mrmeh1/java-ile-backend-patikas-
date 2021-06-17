package Dersler;
import java.util.Scanner;
public class vke {
    public static void main(String[] args) {
        double boy,kilo,vke;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo= inp.nextDouble();
        vke=(kilo/(boy*boy));
        System.out.print("Vücut Kitle Endeksiniz: " + vke);
    }
}
