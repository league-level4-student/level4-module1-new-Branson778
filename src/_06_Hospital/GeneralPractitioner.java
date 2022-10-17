package _06_Hospital;

import java.util.List;
import java.util.ArrayList;

public class GeneralPractitioner extends Doctor {
	GeneralPractitioner() {
		listp = new ArrayList<Patient>();
	}
	@Override
	public List<Patient> getPatients() {
		return listp;
	}
	@Override
	public void assignPatient(Patient patient) throws DoctorFullException {
		if(listp.size()<3) {
			listp.add(patient);
		}
		else {
			throw new DoctorFullException();
		}
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
		for (int i = 0; i < listp.size(); i++) {
			listp.get(i).checkPulse();
		}
		
	}
	@Override
	public Patient getPatient(int index) {
		return listp.get(index);
		
	}
}
