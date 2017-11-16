
public class OperasiSegitiga extends Segitiga{
	
	public OperasiSegitiga(double alas, double tinggi, double sisi_samping){
		super(alas, tinggi, sisi_samping);
	}
	
	public double keliling(){
		return (super.alas+2*super.sisi_samping);
	}
	
	public double luas(){
		return (0.5*super.alas*super.tinggi);
	}
}
