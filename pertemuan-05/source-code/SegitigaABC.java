import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import segitiga.samasisi;

public class SegitigaABC {

public static void main(String[] args) {
      double luas;
      double sisi = 7;
      String hasil= "";
      DecimalFormat formatAngka;

      formatAngka = new DecimalFormat("0.00");

hasil += "Segitiga Sama Sisi\n\nPanjang sisi : " + sisi + "\n\n";
luas = samasisi.hitungLuas(7);
hasil += "Luas Segitiga : " + formatAngka.format(luas) + "\n";

      JOptionPane.showMessageDialog(null, hasil,
      "Menghitung Luas Segitiga Sama Sisi",
      JOptionPane.INFORMATION_MESSAGE);

      System.exit(0);
      }
}