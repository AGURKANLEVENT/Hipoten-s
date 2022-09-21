import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler Oluşturuldu.

        int a, b;
        double c;

        Scanner deger = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = deger.nextInt();

        System.out.print("2. Kenarı Giriniz :");
        b = deger.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs : " + c);

    }
}