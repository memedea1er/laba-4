import java.util.Scanner;
import static java.lang.Math.*;

// s=prl l=s/pr

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, s, s2;
        System.out.println("Введите a");
        a = toRadians(sc.nextInt());
        System.out.println("Введите s");
        s = sc.nextInt();
        s2 = (4*s*sin(a)*cos(a)*cos(a))/pow(1+sin(a),2);
        System.out.println("S2 = " + s2);
    }
}