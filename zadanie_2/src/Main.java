import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1, v2, t, s;
        System.out.println("Введите v1");
        v1 = sc.nextInt();
        System.out.println("Введите v2");
        v2 = sc.nextInt();
        System.out.println("Введите t");
        t = sc.nextInt();
        s=(v1+v2)*t;
        System.out.println("s = " + s);
    }
}