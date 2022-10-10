package _06_Hospital;

import java.util.List;

public class Surgeon extends Doctor {
	listp = new List<Patient>();
	@Override
	public List<Patient> getPatients() {
		return listp;
	}
	@Override
	public void assignPatient(Patient patient) {
		listp.add(patient);
	}
	@Override
	public boolean performsSurgery() {
		return true;
	}
	@Override
	public boolean makesHouseCalls() {
		return false;
	}
	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}
}
