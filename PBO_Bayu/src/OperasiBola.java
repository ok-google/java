
public class OperasiBola extends Bola{
	
	public OperasiBola(double r){
		super(r);
	}
	
	public double volume(){
		return (1.33*this.phi*this.r*this.r*this.r);
	}
}
