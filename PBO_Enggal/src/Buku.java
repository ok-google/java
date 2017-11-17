
public class Buku {
	public int id_kategori;
	public String nama_kategori;
	public int id_buku;
	public String judul;
	public int harga;
	
	public Buku(int id_kategori, int id_buku) {
		this.id_kategori = id_kategori;
		this.id_buku = id_buku;
		
		if(id_kategori == 1){
			this.nama_kategori = "Pendidikan";
			
			if(id_buku == 1){
				this.judul = "Pendidikan A";
				this.harga = 10000;
			}
			if(id_buku == 2){
				this.judul = "Pendidikan B";
				this.harga = 20000;
			}
			if(id_buku == 3){
				this.judul = "Pendidikan C";
				this.harga = 30000;
			}
			
		}
		
		if(id_kategori == 2){
			this.nama_kategori = "Cerita";
			
			if(id_buku == 1){
				this.judul = "Cerita A";
				this.harga = 10000;
			}
			if(id_buku == 2){
				this.judul = "Cerita B";
				this.harga = 20000;
			}
			if(id_buku == 3){
				this.judul = "Cerita C";
				this.harga = 30000;
			}
		}
		
		if(id_kategori == 3){
			this.nama_kategori = "Novel";
			
			if(id_buku == 1){
				this.judul = "Novel A";
				this.harga = 10000;
			}
			if(id_buku == 2){
				this.judul = "Novel B";
				this.harga = 20000;
			}
			if(id_buku == 3){
				this.judul = "Novel C";
				this.harga = 30000;
			}
		}
	}
}
