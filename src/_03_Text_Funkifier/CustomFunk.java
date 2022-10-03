package _03_Text_Funkifier;

import java.lang.reflect.Array;

public class CustomFunk implements TextFunkifier {

	private String unfunkifiedText;
	
	CustomFunk(String unfunkifiedText){
		 this.unfunkifiedText = unfunkifiedText;
	}
	
	@Override
	public String funkifyText() {
		char[] converter = unfunkifiedText.toCharArray();
		String finals = "";
		for (int i = 0; i < converter.length; i++) {
			if(i%3==0) {
				char temp = Array.getChar(converter, i);
				finals = finals + temp;
			}
		}
		return finals;
	}

}
