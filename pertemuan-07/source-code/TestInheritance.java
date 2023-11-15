class Dosen extends Manusia{
   private String gelar;
   private String matkul;

   public Dosen(){
     nama="Linus Torvalds";
     umur=30;
     this.gelar="Master of Engineering";
     this.matkul="Software Engineering";
}
public void cetak(){
   System.out.println("======DATA DOSEN=====");
   System.out.println("Nama :"+nama);
   System.out.println("Umur:"+umur);
   System.out.println("Gelar:"+gelar);
   System.out.println("Mata Kuliah:"+matkul);
   }
}

public class TestInheritance{
public static void main(String args[]){

    Manusia orang1=new Manusia();
    orang1.cetak();
         System.out.println();
         System.out.println();
    Mahasiswa mhs1=new Mahasiswa();
    mhs1.cetak();
         System.out.println();
         System.out.println();
    Dosen dosen1=new Dosen();
    dosen1.cetak();

    }
}