import java.util.Scanner;

public class QuadraticEquation {
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    double c;

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.getter();
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta =" + delta);
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép là :");
            quadraticEquation.nghiemKep();
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt :");
            System.out.println("X1 = " + quadraticEquation.getRoot1(delta));

            System.out.println("X2 = " + quadraticEquation.getRoot2(delta));
        }
    }

    QuadraticEquation() {
    }

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void getter() {
        System.out.print("Nhập a :");
        a = sc.nextDouble();
        System.out.print("\nNhập b :");
        b = sc.nextDouble();
        System.out.print("\nNhập c :");
        c = sc.nextDouble();
    }

    double heSo() {
        return this.a;
    }

    double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    double nghiemKep() {
        return -b / 2 * a;
    }

    double getRoot1(double delta) {
        double x1 = (-b + Math.sqrt(delta) / 2 * a);
        return x1;
    }

    double getRoot2(double delta) {
        double x2 = (-b - Math.sqrt(delta) / 2 * a);
        return x2;
    }
}
