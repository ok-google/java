import java.util.Scanner;
import java.util.ArrayList;
import celana.Celana;
import kaos.Kaos;
import kemeja.Kemeja;
import sarung.Sarung;

public class MainModul2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Celana> beliCelana = new ArrayList<Celana>();
		ArrayList<Kaos> beliKaos = new ArrayList<Kaos>();
		ArrayList<Kemeja> beliKemeja = new ArrayList<Kemeja>();
		ArrayList<Sarung> beliSarung = new ArrayList<Sarung>();
		Boolean ulang = true;
		int pilihan, banyakBeli = 0, total = 0, banyakItem = 0, totalItem = 0;
		
		while(ulang) {
			System.out.println("Pilih Salah Satu");
			System.out.println("1. Kemeja "+
							   "\n2. Kaos" +
							   "\n3. Celana" +
							   "\n4. Sarung" +
							   "\n5. Exit");
			System.out.print("Masukan Pilihan = ");
			pilihan = cin.nextInt();
			if(pilihan < 5) {
				System.out.print("Masukan Banyak Pembelian = ");
				banyakBeli = cin.nextInt();
			}
			
			switch(pilihan){
				case 1:
					beliKemeja.add(new Kemeja(banyakBeli));
					break;
				case 2:
					beliKaos.add(new Kaos(banyakBeli));
					break;
				case 3:
					beliCelana.add(new Celana(banyakBeli));
					break;
				case 4:
					beliSarung.add(new Sarung(banyakBeli));
					break;
				case 5:
					ulang = false;
					break;
			}
		}
		
		
		System.out.println("Pembelian Kemeja : ");
		for(Kemeja daftarKemeja : beliKemeja) {
			ulang = true;
			banyakItem = banyakItem + daftarKemeja.getItem();
			totalItem = totalItem + daftarKemeja.getTotal();
		}
		
		if(ulang) {
			total = total + totalItem;
			System.out.println("Banyak Item           = " + banyakItem + " buah\n" +
		           	   		   "Total harga Kemeja    = Rp. " + totalItem);
			ulang = false;
		}
			
		
		System.out.println("Pembelian Kaos : ");
		for(Kaos daftarKaos : beliKaos) {
			ulang = true;
			banyakItem = banyakItem + daftarKaos.getItem();
			totalItem = totalItem + daftarKaos.getTotal();
		}
		if(ulang) {
			total = total + totalItem;
			System.out.println("Banyak Item           = " + banyakItem + " buah\n" +
			           		   "Total harga Kemeja    = Rp. " + totalItem);
			ulang = false;
		}
		
		System.out.println("Pembelian Celana : ");
		for(Celana daftarCelana : beliCelana) {
			ulang = true;
			banyakItem = banyakItem + daftarCelana.getItem();
			totalItem = totalItem + daftarCelana.getTotal();
		}
		
		if(ulang) {
			total = total + totalItem;
			System.out.println("Banyak Item           = " + banyakItem + " buah\n" +
			           		   "Total harga Kemeja    = Rp. " + totalItem);
			ulang = false;
		}
		
		System.out.println("Pembelian Sarung : ");
		for(Sarung daftarSarung : beliSarung) {
			ulang = true;
			banyakItem = banyakItem + daftarSarung.getItem();
			totalItem = totalItem + daftarSarung.getTotal();
		}
		
		if(ulang) {
			total = total + totalItem;
			System.out.println("Banyak Item           = " + banyakItem + " buah\n" +
			           		   "Total harga Kemeja    = Rp. " + totalItem);
			ulang = false;
		}

		System.out.println("Total Keseluruhan     = " + total);
		
		cin.close();

	}

}
