class Flashdisk{
   private String Warna;
   private String merek;
   private int kapasitaspenyimpanan;
   private int harga;

public Flashdisk(String wrn,String mrk,int kpstspnympn, int hrg){
   this.warna=wrn;
   this.merek=mrk;
   this.kapasitaspenyimpanan=kpstspnympn;
   this.harga=hrg;
}
public void tampilhargaFlashdisk()
{
System.out.println("================HARGA FLASHDISK================");
System.out.println("Warna Flashdisk \t \t: "+this.warna");
System.out.println("Merek Flashdisk \t \t: "+this.merek");
System.out.println("Kapasitas Penyimpanan Flashdisk \t: "+this.kapasitaspenyimpanan+" GB");
System.out.println("Harga Flashdisk \t \t: "Rp "+this.harga");
	}
}

public class hargaFlashdisk{
public static void main(String[] args){
Flashdisk fd=new Flashdisk("Putih","TOSHIBA",16,100000);
fd.tampilanhargaFlashdisk();
	}
}