public class Komputer {

String merk;
String graphic;
String ram;
String os;
String processor;

   public Komputer(String merk, String graphic,
   String ram, String os, String processor){
      	this.merk = merk;
      	this.graphic = graphic;
      	this.ram = ram;
      	this.os = os;
      	this.processor = processor;
   }

   public String getMerk(){
      return merk;
   }

   public String getGraphic(){
      return graphic;
   }

   public String getRam(){
      return ram;
   }

   public String getOs(){
      return os;
   }

   public String getProcessor(){
         return processor;
   }
   @Override
   public String toString(){

   return("Aku punya komputer baru merknya " + this.getMerk() +
      	", graphic card nya " + this.getGraphic() +
      	", kapasitas RAM nya " + this.getRam()+
      	", operating system nya " + this.getOs() +
      	", dan processor nya " + this.getProcessor() +
      	". Aku senang sekali.");
   }
   public static void main(String[]args){
      Komputer canggih = new Komputer
      	("HP OMEN 15-DC0036TX"," NVIDIA GeForce GTX 1050 Ti",
      	"16 GB DDR4", "Windows 10", " Intel Core i7");
      		System.out.println(canggih.toString());
  			}
}