package controllers;
/*
 This program demonstrates: object-oriented thinking to calculate perimeter and area of ??triangles! ! !
 */
class Test {

    int a;
    int b;
    int c;

    public int zhouchang() {
        return a + b + c;
    }

    public double area() {
        double p = 1.0 * (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}

public class Triangle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Test triangle = new Test();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("Perimeter ++++" + triangle.zhouchang());

        System.out.println("Area ++++" + triangle.area());
    }

}