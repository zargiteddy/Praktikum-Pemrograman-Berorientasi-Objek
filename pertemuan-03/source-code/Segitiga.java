public class Segitiga {


public static void main(String[] args) {
double a,b,c,s;
Triangle triangle = new Triangle();

    a = 3;
    b = 4;
    c = 5;
    triangle.setA(a);
    triangle.setB(b);
    triangle.setC(c);
    s = triangle.area();
    System.out.println("s = " + s);
}
private static class Triangle{
    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double area(){
        double p,s;
        p = (a+b+c)/2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
}