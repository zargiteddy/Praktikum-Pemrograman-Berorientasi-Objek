class Mahasiswa extends Manusia{
   private String nim;
   private String jurusan;

   public Mahasiswa(){
     nama="Kurniawati";
     umur=19;
     this.nim="145419674";
     this.jurusan="TI";
}
public void cetak(){
   System.out.println("======DATA MAHASISWA====");
   System.out.println("NIM :"+nim);
   System.out.println("Nama:"+nama);
   System.out.println("Umur:"+umur);
   System.out.println("Jurusan:"+jurusan);
   }
}
//program utama
public class TestPewarisan{
   public static void main(String args[]){
     Manusia orang1=new Manusia();
     orang1.cetak();
       System.out.println();
       System.out.println();
     Mahasiswa mhs1=new Mahasiswa();
    mhs1.cetak();
    }
}

