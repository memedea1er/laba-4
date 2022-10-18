import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        zadanie_1_1();
        zadanie_1_2();
    }
    public static void zadanie_1_1() {
        Scanner sc = new Scanner(System.in);
        double y, k, r;
        System.out.println("Введите y");
        y = sc.nextInt();
        System.out.println("Введите k");
        k = sc.nextInt();
        r = sqrt(sin(y) * sin(y) + 6.835) / (log(y + k) + 3 * y * y);
        System.out.println("R = " + r);
    }
    public static void zadanie_1_2() {
        Scanner sc = new Scanner(System.in);
        double l, y, x, z;
        System.out.println("Введите x");
        x = sc.nextInt();
        System.out.println("Введите y");
        y = sc.nextInt();
        System.out.println("Введите z");
        z = sc.nextInt();
        l=(pow(10,x)+abs(pow((y-x),2)/2-pow((x-y),2)/3))/(cos(x)+sin(z)+5*y+10);
        System.out.println("L = " + l);
    }
}