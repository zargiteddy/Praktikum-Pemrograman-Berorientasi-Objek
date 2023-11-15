class Titik{
int x;
 int y;
   public Titik(){
     System.out.println("Konstruktor titik dijalankan!");
     }
   public Titik(int x, int y) {
   this.x = x;
   this.y = y;
   System.out.println("Konstruktor titik 2 dijalankan!");
}
}
public class TesTitik {
  public static void main(String[] args) {
    Titik a=new Titik();
    Titik b=new Titik(10,10);
    System.out.println("X: " + b.x);
    System.out.println("Y: " + b.y);
    }
}