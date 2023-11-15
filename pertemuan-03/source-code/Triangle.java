class Segitiga {

    int a;
    int b;
    int c;

    public double luas() {
        double p = 1.0 * (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
public class Triangle {

    public static void main(String[] args) {
        Segitiga triangle = new Segitiga();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("Luas Segitiga = " + triangle.luas());
    }

}