package kaos;

import celana.Celana;

public class Kaos extends Celana {
	
	public HargaKaos biayaKaos = new HargaKaos();
	
	public Kaos() {
		super();
	}
	
	public Kaos(int banyak) {
		super(banyak);
	}
	
	/**
	 * Override
	 */
	
	public void setHarga() {
		this.biayaKaos.setHarga();
	}
	
	/**
	 * Override
	 */
	
	public int getHarga() {
		return this.biayaKaos.getHarga();
	}
}
