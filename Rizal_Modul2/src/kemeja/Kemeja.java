package kemeja;

import celana.Celana;

public class Kemeja extends Celana{
	
	public HargaKemeja biayaKemeja = new HargaKemeja();
	
	public Kemeja() {
		super();
	}
	
	public Kemeja(int banyak) {
		super(banyak);
	}
	
	/**
	 * Override
	 */
	
	public void setHarga() {
		this.biayaKemeja.setHarga();
	}
	
	/**
	 * Override
	 */
	
	public int getHarga() {
		return this.biayaKemeja.getHarga();
	}
}
