
public class OperasiTabung extends Tabung{
	
	public OperasiTabung(double r, double tinggi){
		super(r, tinggi);
	}
	
	public double volume(){
		return ((this.phi*this.r*this.r)*this.tinggi);
	}
}
