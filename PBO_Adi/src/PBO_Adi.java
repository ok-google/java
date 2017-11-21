import java.util.Scanner;

public class PBO_Adi {
    
    public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		varGanjilGenap hasil = new varGanjilGenap();
		Konversi data;
		int[] nilai = new int[20];
		int banyak, banyakGanjil, banyakGenap;
		
		System.out.print("Berapa Nilai yang ingin anda masukan = ");
		banyak = cin.nextInt();
    	
    	for(int kounter = 0; kounter < banyak; kounter++){
    		System.out.print("Masukan Angka ke-" + (kounter+1) + " = ");
			nilai[kounter] = cin.nextInt();
    	}
    	
    	data = new Konversi(nilai);
    	banyakGanjil = data.setGanjil(banyak);
    	hasil.ganjil = data.getGanjil();
    	banyakGenap = data.setGenap(banyak);
    	hasil.genap = data.getGenap();
    	
    	System.out.print("\n Bilangan Ganjil = ");
    	
    	for(int kounter = 0; kounter < banyakGanjil; kounter++){
    		if(kounter!=0)
    			System.out.print(", ");
    		System.out.print(hasil.ganjil[kounter]);
    	}
    	
    	System.out.print("\n Bilangan Genap = ");
    	
    	for(int kounter = 0; kounter < banyakGenap; kounter++){
    		if(kounter!=0)
    			System.out.print(", ");
    		System.out.print(hasil.genap[kounter]);
    	}
    	
    	
    }
}
