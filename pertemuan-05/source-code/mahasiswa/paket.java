package mahasiswa;
public class paket
{
    String nama;
    int umur;
    public static void isiPaket(){
    System.out.println("ini hasil import");
}
public void setData(int umur, String nama){
 this.umur = umur;
   this.nama = nama;
}
     public void info(){
      System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        }
}