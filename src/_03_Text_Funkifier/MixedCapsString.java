package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;
    
    private String temp;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;
        
    }

	@Override
	public String funkifyText() {
		temp = "";
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			if(i%2!=0) {
				char temp2 = Character.toUpperCase(unfunkifiedText.charAt(i));
				temp = temp+temp2;
			}
			else {
				char temp2 = Character.toLowerCase(unfunkifiedText.charAt(i));
				temp = temp+temp2;
			}
		}
		unfunkifiedText = temp;
		return unfunkifiedText;
	}

}
