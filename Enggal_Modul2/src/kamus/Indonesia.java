package kamus;

import java.util.ArrayList;

public class Indonesia {
	public String translate;
	
	public void setKata(String cari){
		this.translate = cari;
	}
	
	public String getTranslate(ArrayList<dataKamus> kamus, String cari){
		for(dataKamus data : kamus){
			if(data.indo.equals(cari)){
				return data.english;
			}
		}
		return "";
	}
	
	/**
	 *@overload
	 */
	
	public String getTranslate(ArrayList<dataKamus> kamus){
		for(dataKamus data : kamus){
			if(data.indo.equals(this.translate)){
				return data.english;
			}
		}
		return "";
	}
}
