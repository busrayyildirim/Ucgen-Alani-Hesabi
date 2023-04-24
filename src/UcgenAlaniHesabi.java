import java.util.Scanner;

public class UcgenAlaniHesabi {
    /*Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
    Formül
    Üçgenin Çevresi: 2u
    u = (a+b+c) / 2
    Alan * Alan = u * ( u - a) * (u - b) * (u - c) */
    public static void main(String[] args) {
        int a, b, c;
        double area, u;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz:");
        a = inp.nextInt();
        System.out.print("2. Kenarı Giriniz:");
        b = inp.nextInt();
        System.out.print("3. Kenarı Giriniz:");
        c = inp.nextInt();

        u = ((a + b + c) / 2);
        System.out.println("Üçgenin Çevresi:" + 2 * u);
        area = Math.sqrt(u * (u-a) * (u-b) *(u-c));
        System.out.println("Üçgenin Alanı:" + area);


    }
}
