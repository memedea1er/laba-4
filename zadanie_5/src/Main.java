import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, x3, y1, y2, y3, x,y;
        System.out.println("Введите x1");
        x1 = (sc.nextInt());
        System.out.println("Введите y1");
        y1 = sc.nextInt();
        System.out.println("Введите x2");
        x2 = (sc.nextInt());
        System.out.println("Введите y2");
        y2 = (sc.nextInt());
        System.out.println("Введите x3");
        x3 = (sc.nextInt());
        System.out.println("Введите y3");
        y3 = (sc.nextInt());
        x = prx(x1, x2, y1, y2, x3, y3);
        y = pry(x1, x2, y1, y2, x3, y3);
        System.out.println("Projection on X is: " + x);
        System.out.println("Projection on Y is: " + y);
    }
    public static double prx(double x1, double x2, double y1, double y2, double x3, double y3) {
            double abx = x1 - x2;
            double aby = y1 - y2;
            double dacb = (x3 - x2) * abx + (y3 - y2) * aby;
            double dab = abx * abx + aby * aby;
            double t = dacb / dab;
            return x2 + aby * t;
    }
    public static double pry(double x1, double x2, double y1, double y2, double x3, double y3) {
            double abx = x1 - x2;
            double aby = y1 - y2;
            double dacb = (x3 - x2) * abx + (y3 - y2) * aby;
            double dab = abx * abx + aby * aby;
            double t = dacb / dab;
            return y2 + abx * t;
    }
}