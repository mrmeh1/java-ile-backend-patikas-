package Dersler;
import java.util.Scanner;
public class daireninAlanıÇevresi {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14;
        Scanner değer=new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Girin: ");
        r=değer.nextInt();

        System.out.print("Merkez Açının Ölçüsünü Girin: ");
        a=değer.nextInt();

        double alan=(pi*(r*r)*a)/360;
        double çevre=(2*pi*r);

        System.out.println("Daire Diliminin Alanı: " + alan);
        System.out.println("Daire Diliminin Çevresi " + çevre);

    }

}
