import java.util.Scanner;

import static java.lang.Math.toRadians;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1, a5, n, an, s, b;
        System.out.println("Введите a1");
        a1 = (sc.nextInt());
        System.out.println("Введите a5");
        a5 = sc.nextInt();
        System.out.println("Введите n");
        n = sc.nextInt();
        b = (a5 - a1) / 4;
        an = a1 + b * (n - 1);
        s = (a1 + an) * n / 2;
        System.out.println("an = " + an);
        System.out.println("s = " + s);
    }
}