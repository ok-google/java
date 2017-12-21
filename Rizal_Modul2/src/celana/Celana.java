package celana;

public class Celana {
	public int banyakItem;
	public HargaCelana biayaCelana = new HargaCelana();
	
	public Celana() {
		this.banyakItem = 0;
	}
	
	public Celana(int banyak) {
		this.banyakItem = banyak;
	}
	
	public void setItem(int banyak) {
		this.banyakItem = banyak;
	}
	
	public int getItem() {
		return this.banyakItem;
	}
	
	public void setHarga() {
		this.biayaCelana.setHarga();
	}
	
	public int getHarga() {
		return this.biayaCelana.getHarga();
	}
	
	public int getTotal() {
		this.setHarga();
		
		return this.banyakItem*this.getHarga();
	}
}
