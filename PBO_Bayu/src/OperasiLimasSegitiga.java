
public class OperasiLimasSegitiga extends LimasSegitiga{
	
	public OperasiLimasSegitiga(double alas, double tinggi_alas, double tinggi_limas){
		super(alas, tinggi_alas, tinggi_limas);
	}
	
	public double volume(){
		return (0.33*(0.5*this.alas*this.tinggi_alas)*this.tinggi_limas);
	}
}
