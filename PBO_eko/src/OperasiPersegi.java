
public class OperasiPersegi extends Persegi{
	public OperasiPersegi(int sisi) {
		super(sisi);
	}
	
	public int keliling(){
		return (4*super.sisi);
	}
	
	public int luas(){
		return (super.sisi*super.sisi);
	}
}
