import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int r, a;
        double pi = Math.PI, result;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Dairenin Yarıçapını Giriniz:");
        r = sc.nextInt();

        System.out.print("Daire Dilimini Giriniz: ");
        a = sc.nextInt();

        // RESULT
        result = (pi * (r * r) * a) / 360;

        // PRINT
        System.out.println("Daire Dilimi: " + result);

    }
}
