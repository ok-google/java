package kamus;

import java.util.ArrayList;

public class English extends Indonesia{
	/**
	 *@overide
	 */
	 
	public String getTranslate(ArrayList<dataKamus> kamus, String cari){
		for(dataKamus data : kamus){
			if(data.english.equals(cari)){
				return data.indo;
			}
		}
		return "";
	}
	
	/**
	 *@overload
	 *@override
	 */
	
	public String getTranslate(ArrayList<dataKamus> kamus){
		for(dataKamus data : kamus){
			if(data.english.equals(this.translate)){
				return data.indo;
			}
		}
		return "";
	}
	
}
