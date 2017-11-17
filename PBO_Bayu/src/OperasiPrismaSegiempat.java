
public class OperasiPrismaSegiempat extends PrismaSegiempat{
	
	public OperasiPrismaSegiempat(double sisi, double tinggi){
		super(sisi, tinggi);
	}
	
	public double volume(){
		return ((this.sisi*this.sisi)*this.tinggi);
	}
}
