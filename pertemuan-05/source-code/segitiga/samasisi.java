package segitiga;
public class samasisi {

   public static double hitungLuas(double sisiAB) {
      double luas;
      double tinggi =
      Math.sqrt(Math.pow(sisiAB, 2) - Math.pow((0.5 * sisiAB), 2));
      luas = sisiAB * tinggi;
      return luas;
   }
}