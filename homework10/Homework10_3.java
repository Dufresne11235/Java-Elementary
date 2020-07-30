package jelesson10.homework10;

public class Homework10_3 {
    public static void main(String[] args) throws Exception {
        Equation test1 = new Equation(1d, -8d, 12d);
        test1.solve();
        Equation test2 = new Equation(1d, -6d, 9d);
        test2.solve();
        Equation test3 = new Equation(5d, 3d, 7d);
        //test3.solve();
    }
}

class Equation {
    private final double a;
    private final double b;
    private final double c;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve() throws Exception {
        double dis = b * b - 4 * a * c;
        if (dis > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(dis)) / (2 * a);
            x2 = (-b + Math.sqrt(dis)) / (2 * a);
            System.out.println("Discriminant > 0: " + x1 + " , " + x2);
        } else if (dis == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Discriminant = 0: " + x);
        } else {
            throw new Exception("Discriminant > 0: No valid solutions");
        }
    }
}
