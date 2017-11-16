
public class OperasiLingkaran extends Lingkaran{
	
	public OperasiLingkaran(double r) {
		super(r);
	}	
	
	public double keliling(){
		return (super.phi*(2*super.r));
	}
	
	public double luas(){
		return (super.phi*super.r*super.r);
	}
}
