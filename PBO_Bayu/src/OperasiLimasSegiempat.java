
public class OperasiLimasSegiempat extends LimasSegiempat{
	
	public OperasiLimasSegiempat(double sisi, double tinggi){
		super(sisi, tinggi);
	}
	
	public double volume(){
		return (0.33*(this.sisi*this.sisi)*this.tinggi);
	}
}
