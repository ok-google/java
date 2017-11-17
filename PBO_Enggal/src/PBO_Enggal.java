import java.util.Scanner;

public class PBO_Enggal {
    
    public static void main(String[] args) {
    	Scanner masukan = new Scanner(System.in);
    	DataDiri data;
    	Buku[] beli_buku = new Buku[10];
    	String nama, alamat, no_hp, beli_lagi = "y";
    	int menu_awal, pilih_buku, pilih_judul, banyak_buku, total = 0;
    	
    	System.out.println("Menu");
    	System.out.println("1. Beli Buku");
    	System.out.println("2. Keluar");
    	
    	System.out.println("Isi data diri");
		System.out.print("Nama = ");
		nama = masukan.next();
		System.out.print("Alamat = ");
		alamat = masukan.next();
		System.out.print("NO Hp = ");
		no_hp = masukan.next();
		
		data = new DataDiri(nama, alamat, no_hp);
		banyak_buku = 0;
		while(beli_lagi.equals("y")){
			
			System.out.println("Pilih Buku");
	    	System.out.println("1. Pendidikan");
	    	System.out.println("2. Cerita");
	    	System.out.println("3. Novel");
	    	System.out.print("Masukan Kategori Anda = ");
	    	pilih_buku = masukan.nextInt();
	    	
	    	System.out.println("Pilih Judul");
    	
    	
		
			switch(pilih_buku){
	    		case 1 : 
			    	System.out.println("1. Pendidikan A");
			    	System.out.println("2. Pendidikan B");
			    	System.out.println("3. Pendidikan C");
			    	break;
			    case 2:
			    	System.out.println("1. Cerita A");
			    	System.out.println("2. Cerita B");
			    	System.out.println("3. Cerita C");
			    	break;
			    case 3:
			    	System.out.println("1. Novel A");
			    	System.out.println("2. Novel B");
			    	System.out.println("3. Novel C");
			    	break;
	    	}
			
			System.out.print("Masukan pilihan judul = ");
			pilih_judul = masukan.nextInt();
			beli_buku[banyak_buku] = new Buku(pilih_buku, pilih_judul);
			
			System.out.print("Beli Lagi [y/n] = ");
			beli_lagi = masukan.next();
			banyak_buku+=1;
		}
		
		System.out.println("Struk Pembelian");
		System.out.println("Nama   : " + data.nama);
		System.out.println("Alamat : " + data.alamat);
		System.out.println("No HP  : " + data.No_hp);
		
		for(int kounter = 0; kounter<banyak_buku; kounter++){
			System.out.println("Judul  : " + beli_buku[kounter].judul);
			System.out.println("Harga  : " + beli_buku[kounter].harga);
			
			total = total + beli_buku[kounter].harga;
		}
		
		System.out.println("Jumlah : " + banyak_buku);
		System.out.println("Total  : " + total);
		
    }
}
