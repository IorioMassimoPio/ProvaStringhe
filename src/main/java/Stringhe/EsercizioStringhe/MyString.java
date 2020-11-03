package Stringhe.EsercizioStringhe;

import java.util.ArrayList;

public class MyString {

	public boolean pangramma(String s) {
		for(char c='a'; c<='z'; c++) {
			boolean esiste=false;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)==c) {
					esiste=true;
					break;
				}
			}
			if(!esiste)
				return false;
		}
		return true;
	}
	
	public boolean palindroma(String s) {
		s=s.replace(" ","");	//rimpiazza gli spazi, con la stringa vuota (in questo caso, elimina semplicemente gli spazi
		String str ="";
		for(int i=s.length()-1; i>=0; i--) {
			str+=s.charAt(i);
		}
		return str.equals(s);
	}
	
	public ArrayList<String> tokenizzazione(String s){
		ArrayList<String> token = new ArrayList<String>();
		String str="";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ')
				str+=s.charAt(i);
			else {
				token.add(str);
				str="";
			}
		}
		token.add(str);
		return token;
	}
}
