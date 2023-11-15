public class PesertaKursus
{
   String nama;
   int no_id;
   String alamat;
   String tgl_lahir;
   String jenis_kelamin;
   String no_hp;
   String jenis_kursus;

PesertaKursus(String name,int id, String almt, String tgl,
       String jk, String hp, String kursus)
   {
       nama = name;
       no_id = id;
       alamat = almt;
       tgl_lahir = tgl;
       jenis_kelamin = jk;
       no_hp = hp;
       jenis_kursus = kursus;
   }

void TampilkanData()
{
   System.out.println("=====Informasi Peserta Kursus=====");
   System.out.println("Nama : "+nama);
   System.out.println("Nomor ID : "+no_id);
   System.out.println("Alamat : "+alamat);
   System.out.println("Tanggal Lahir : "+tgl_lahir);
   System.out.println("Jenis Kelamin : "+jenis_kelamin);
   System.out.println("Nomor HP : "+no_hp);
   System.out.println("Jenis Kursus : "+jenis_kursus);
   System.out.println("==================================");
}

public static void main(String args[])
{
   PesertaKursus peserta = new PesertaKursus
   ("Raden Isnawan Argi",19541,"Yogyakarta","6 Maret 2000",
   "Laki-Laki","081234567891","Matematika");

   peserta.TampilkanData();
  }
}