class Pangkat {
  int nilai = 2;
  int pangkat = 3;
  double hasil;

  void hitungPangkat()
    {
    hasil = Math.pow(nilai, pangkat);
    System.out.println(hasil);
    }
}

public class ObyekPangkat {
  public static void main (String args []){
    Pangkat pangkat1 = new Pangkat();
    pangkat1.hitungPangkat();
  }
}