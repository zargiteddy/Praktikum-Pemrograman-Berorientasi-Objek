public class Mahasiswa{
    private String nim,nama,TampilkanData;

//  method mutator
     public void setNim(String nim) {
     this.nim=nim;
     }
     public void setNama(String nama) {
     this.nama=nama;
     }
     public void setTampilkanData(String TampilkanData) {
	 this.TampilkanData=TampilkanData;
	 }

//method acessor
     public String getNim() {
     return nim;
     }
     public String getNama() {
     return nama;
     }
     public String getTampilkanData() {
     return TampilkanData;
}

public static void main(String args[]){
     Mahasiswa obj=new Mahasiswa();
     obj.setTampilkanData("===Menampilkan Data===");
         obj.setNim("175410001");
           obj.setNama("Azkiya");
     System.out.println(obj.getTampilkanData());
     System.out.println("Nim : "+ obj.getNim());
     System.out.println("Nama : "+ obj.getNama());
    }
}