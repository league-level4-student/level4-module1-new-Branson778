package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> listd = new ArrayList<Doctor>();
	List<Patient> listp = new ArrayList<Patient>();
	
	public List<Doctor> getDoctors() {
		return listd;
	}

	public List<Patient> getPatients() {
		return listp;
	}

	public void addPatient(Patient patient) {
		listp.add(patient);
		
	}

	public void addDoctor(Doctor doctor) {
		listd.add(doctor);
		
	}

	public void assignPatientsToDoctors() {
		int index = 0;
		boolean repeat = false;
		for (int i = 0; i < listd.size(); i++) {
			if(repeat==true) {
				i--;
				repeat=false;
			}
			try {
				listd.get(i).assignPatient(listp.get(index));
			}
			catch(DoctorFullException dfe) {
				repeat=false;
				continue;
			}
			index++;
			repeat=true;
		}
		
	}

}
