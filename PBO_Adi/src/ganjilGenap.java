
public class ganjilGenap extends AbstractKonversi{
	int[] Data = new int[20];
	varGanjilGenap nilai = new varGanjilGenap();
	
	public void setData(int[] data) {
		this.Data = data;
	}
	
	public int setGanjil(int panjang){
		int ganjilKounter = 0;
		for(int kounter = 0 ; kounter < panjang; kounter++ ){
			if(this.Data[kounter] % 2 == 1){
				nilai.ganjil[ganjilKounter] = this.Data[kounter];
				ganjilKounter++;
			}
		}
		
		return ganjilKounter;
	}
	
	public int setGenap(int panjang){
		int genapKounter = 0;
		for(int kounter = 0 ; kounter < panjang; kounter++ ){
			if(this.Data[kounter] % 2 == 0){
				nilai.genap[genapKounter] = this.Data[kounter];
				genapKounter++;
			}
		}
		
		return genapKounter;
	}
}
