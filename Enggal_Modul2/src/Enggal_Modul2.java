import java.util.Scanner;
import java.util.ArrayList;
import kamus.*;

public class Enggal_Modul2 {
    
    public static void main(String[] args) {
    	Scanner cin = new Scanner(System.in);
    	ArrayList<dataKamus> data = new ArrayList<dataKamus>();
    	English toIndo = new English();
    	Indonesia toEnglish = new Indonesia();
    	String cari;
    	int pilihan;
    	
    	data.add(new dataKamus("makan", "eat"));
    	data.add(new dataKamus("tidur", "sleep"));
    	data.add(new dataKamus("bermain", "play"));
    	
    	System.out.println("1. Dari English Ke Indo");
    	System.out.println("2. Dari Indo Ke English");
    	System.out.print("Masukan Pilihan  = ");
    	pilihan = cin.nextInt();
    	
    	System.out.print("Masukan Kata = ");
    	cari = cin.next();
    	
    	switch(pilihan){
    		case 1:
    			toIndo.setKata(cari);
    			System.out.println("Translate = " + toIndo.getTranslate(data));
    			break;
    		case 2:
    			System.out.println("Translate = " + toEnglish.getTranslate(data, cari));
    			break;
    	}
    }
}
