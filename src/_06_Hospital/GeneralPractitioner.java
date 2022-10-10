package _06_Hospital;

import java.util.List;

public class GeneralPractitioner extends Doctor {
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
		return false;
	}
	@Override
	public boolean makesHouseCalls() {
		return true;
	}
	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}
}
