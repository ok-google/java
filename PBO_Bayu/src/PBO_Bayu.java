import java.util.Scanner;

public class PBO_Bayu {
    
    public static void main(String[] args) {
    	OperasiLimasSegitiga limasSegitiga;
    	OperasiLimasSegiempat limasSegiempat;
    	OperasiPrismaSegiempat prismaSegiempat;
    	OperasiTabung tabung;
    	OperasiBola bola;
    	double sisi, alas, tinggi_alas, tinggi, r;
    	
    	Scanner cin = new Scanner(System.in);
    	
    	System.out.println("Limas Segitiga");
    	System.out.print("Masukan Panjang Alas Limas = ");
    	alas = cin.nextDouble();
    	System.out.print("Masukan Panjang Tinggi Alas Limas = ");
    	tinggi_alas = cin.nextDouble();
    	System.out.print("Masukan Panjang Tinggi Limas = ");
    	tinggi = cin.nextDouble();
    	
    	limasSegitiga = new OperasiLimasSegitiga(alas, tinggi_alas, tinggi);
    	
    	System.out.println("Volume = " + limasSegitiga.volume());
    	
    	System.out.println("Limas Segiempat");
    	System.out.print("Masukan Panjang Sisi Alas Limas = ");
    	sisi = cin.nextDouble();
    	System.out.print("Masukan Panjang Tinggi Limas = ");
    	tinggi = cin.nextDouble();
    	
    	limasSegiempat = new OperasiLimasSegiempat(sisi, tinggi);
    	
    	System.out.println("Volume = " + limasSegiempat.volume());
    	
    	System.out.println("Prisma Segiempat");
    	System.out.print("Masukan Panjang Sisi Alas Prisma = ");
    	sisi = cin.nextDouble();
    	System.out.print("Masukan Panjang Tinggi Prisma = ");
    	tinggi = cin.nextDouble();
    	
    	prismaSegiempat = new OperasiPrismaSegiempat(sisi, tinggi);
    	
    	System.out.println("Volume = " + prismaSegiempat.volume());
    	
    	System.out.println("Tabung");
    	System.out.print("Masukan Panjang Jari-jari Tabung = ");
    	r = cin.nextDouble();
    	System.out.print("Masukan Panjang Tinggi Prisma = ");
    	tinggi = cin.nextDouble();
    	
    	tabung = new OperasiTabung(r, tinggi);
    	
    	System.out.println("Volume = " + tabung.volume());
    	
    	System.out.println("Bola");
    	System.out.print("Masukan Panjang Jari-jari Bola = ");
    	r = cin.nextDouble();
    	
    	bola = new OperasiBola(r);
    	
    	System.out.println("Volume = " + bola.volume());
    }
}
