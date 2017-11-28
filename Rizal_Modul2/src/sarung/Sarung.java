package sarung;

import celana.Celana;

public class Sarung extends Celana{
	public HargaSarung biayaSarung = new HargaSarung();
	
	public Sarung() {
		super();
	}
	
	public Sarung(int banyak) {
		super(banyak);
	}
	
	/**
	 * Override
	 */
	
	public void setHarga() {
		this.biayaSarung.setHarga();
	}
	
	/**
	 * Override
	 */
	
	public int getHarga() {
		return this.biayaSarung.getHarga();
	}
}
