package _06_Hospital;

public class Patient {

	boolean caredFor = false;
	
	public Object feelsCaredFor() {
		return caredFor;
	}

	public void checkPulse() {
		caredFor = true;
		
	}

}
