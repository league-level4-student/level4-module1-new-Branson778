package _03_Text_Funkifier;

import java.lang.reflect.Array;
import java.util.Iterator;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;
    


    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;
        

    }

    @Override
    public String funkifyText() {
    	char[] reverses = unfunkifiedText.toCharArray();
    	//char[] finals = new char[unfunkifiedText.length()];
    	String finalss = "";
    	int lengthdif = reverses.length-1;
        for (int i = 0; i < unfunkifiedText.length(); i++) {
			char temp = Array.getChar(reverses, lengthdif-i);
			finalss = finalss + temp;
		}
        return finalss;

    }
    // string = string + char 
}
