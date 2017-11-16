
public class OperasiPersegiPanjang extends PersegiPanjang{
	
	public OperasiPersegiPanjang(int panjang, int lebar) {
		super(panjang, lebar);
	}
	
	public int keliling(){
		return (2*(super.panjang+super.lebar));
	}
	
	public int luas(){
		return (super.panjang*super.lebar);
	}
}
