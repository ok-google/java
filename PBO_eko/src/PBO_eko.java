import java.util.Scanner;


public class PBO_eko {
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	OperasiSegitiga segitiga;
    	OperasiPersegi Persegi;
    	OperasiPersegiPanjang PersegiPanjang;
    	OperasiLingkaran Lingkaran;
    	double alas, tinggi, sisi_samping, r;
    	int sisi, panjang, lebar;
    	
    	System.out.println("Segitiga : ");
    	System.out.print("Masukan Alas Segitiga = ");
    	alas = input.nextDouble();
    	System.out.print("Masukan Tinggi Segitiga = ");
    	tinggi = input.nextDouble();
    	System.out.print("Masukan Sisi Samping Segitiga = ");
    	sisi_samping = input.nextDouble();
    	
    	segitiga = new OperasiSegitiga(alas, tinggi, sisi_samping);
    	
    	System.out.println("Keliling = " + segitiga.keliling());
    	System.out.println("Luas = " + segitiga.luas());
    	
    	System.out.println("Persegi : ");
    	System.out.print("Masukan Sisi = ");
    	sisi = input.nextInt();
    	
    	Persegi = new OperasiPersegi(sisi);
    	
    	System.out.println("Keliling = " + Persegi.keliling());
    	System.out.println("Luas = " + Persegi.luas());
    	
    	System.out.println("Persegi Panjang : ");
    	System.out.print("Masukan Panjang = ");
    	panjang = input.nextInt();
    	System.out.print("Masukan Lebar = ");
    	lebar = input.nextInt();
    	
    	PersegiPanjang = new OperasiPersegiPanjang(panjang, lebar);
    	
    	System.out.println("Keliling = " + PersegiPanjang.keliling());
    	System.out.println("Luas = " + PersegiPanjang.luas());
    	
    	System.out.println("Lingkaran : ");
    	System.out.print("Masukan jari-jari = ");
    	r = input.nextDouble();
    	
    	Lingkaran = new OperasiLingkaran(r);
    	
    	System.out.println("Keliling = " + Lingkaran.keliling());
    	System.out.println("Luas = " + Lingkaran.luas());
    	
    }
}
