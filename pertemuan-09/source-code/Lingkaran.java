class Lingkaran extends Bentuk {
public Lingkaran(){
System.out.println("Kelas Lingkaran turunan kelas abstrak bentuk");
}
public String getBentuk(){
return "Bentuk Lingkaran";
}
public int HitungLuas(){
		return 0;
	}
    public static void main(String[] args){
    Bentuk geometri = new Lingkaran();
	}
}

